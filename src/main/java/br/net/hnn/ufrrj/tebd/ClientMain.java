package br.net.hnn.ufrrj.tebd;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        try (Socket sock = new Socket("localhost", 5000)) {
            OutputStream oStream = sock.getOutputStream();
            InputStream iStream = sock.getInputStream();

            File f = new File("pedido.xml");
            Files.copy(f.toPath(), oStream);
            sock.shutdownOutput();

            int size = 0;
            byte[] buffer = new byte[1024];
            while ((size = iStream.read(buffer)) != -1) System.out.write(buffer, 0, size);
        }
    }
}
