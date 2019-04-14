package br.net.hnn.ufrrj.tebd;

import br.net.hnn.ufrrj.tebd.gerado.historicoescolar.HistoricoEscolar;
import br.net.hnn.ufrrj.tebd.gerado.pedido.Pedido;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.Socket;

public class RPCConnection implements Runnable {
    private Socket sock;
    private JAXBContext context;
    private RPCInterface rpcInterface;

    public RPCConnection(Socket sock, RPCInterface rpcInterface) throws JAXBException {
        this.sock = sock;
        this.context = JAXBContext.newInstance(HistoricoEscolar.class, Pedido.class);
        this.rpcInterface = rpcInterface;
    }

    private Method findMethod(String methodName) throws NoSuchMethodException {
        Class<RPCInterface> rpcInterfaceClass = RPCInterface.class;

        for (Method m : rpcInterfaceClass.getMethods()) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }

        throw new NoSuchMethodException();
    }

    @Override
    public void run() {
        try (Socket s = sock) {
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(new File("pedido.xsd"));
            Unmarshaller unmarshaller = context.createUnmarshaller();
            unmarshaller.setSchema(schema);
            Pedido pedido = (Pedido) unmarshaller.unmarshal(new IgnoresCloseInputStream(s.getInputStream()));

            Method method = findMethod(pedido.getMetodo());
            Object result = method.invoke(rpcInterface, "2016780485");
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(result, s.getOutputStream());
        } catch (Exception e) {
            System.err.println("we fucked up");
        }
    }

    class IgnoresCloseInputStream extends FilterInputStream {
        IgnoresCloseInputStream(InputStream in) {
            super(in);
        }

        @Override
        public void close() {
            // intentional no op
        }
    }
}
