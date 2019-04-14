package br.net.hnn.ufrrj.tebd;

import br.net.hnn.ufrrj.tebd.gerado.historicoescolar.HistoricoEscolar;
import br.net.hnn.ufrrj.tebd.gerado.pedido.ArgumentoType;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

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

    private Object[] convertArguments(List<ArgumentoType> xmlArgs, Parameter[] parameters) {
        ArrayList<Object> args = new ArrayList<>(xmlArgs.size());
        try {
            for (ArgumentoType arg : xmlArgs) {
                for (Parameter param : parameters) {
                    if (arg.getNome().equals(param.getName())) {
                        Class<?> paramType = param.getType();
                        Constructor<?> constructor = paramType.getConstructor(String.class);
                        args.add(constructor.newInstance(arg.getValor()));
                    }
                }
            }
        } catch (Exception ignore) {
        }

        return args.toArray();
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
            Object[] args = convertArguments(pedido.getArgumentos().getArgumento(), method.getParameters());

            Object result = method.invoke(rpcInterface, args);

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
