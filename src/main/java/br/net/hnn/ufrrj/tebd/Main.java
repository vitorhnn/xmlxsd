package br.net.hnn.ufrrj.tebd;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException {
        try (ServerSocket sock = new ServerSocket(5000)) {
            System.out.println("listening!");
            //noinspection InfiniteLoopStatement
            while (true) {
                Socket cSock = sock.accept();
                new Thread(new RPCConnection(cSock, new HackyRPC())).run();
            }
        }
    }
}
