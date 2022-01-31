import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

class Arguments {
    private final int port;
    private final String directory;
    private final int responses;

    Arguments(int port, String directory, int responses) {
    }

    int getPort() { return port; }
    String getDirectory() { return directory; }
    int getResponses() { return responses; }
}

class MyHttpHandler implements HttpHandler {
    private final Arguments arguments;
    private static int count;

    MyHttpHandler(Arguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
    }

    private void fileNotFound(HttpExchange httpExchange) throws IOException {
    }

    private void fileFound(HttpExchange httpExchange, long length, FileInputStream in) throws IOException {
    }
}

public class Main {
    static Arguments parseArgs(String[] args) {
    }

    public static void main(String[] args) throws IOException {
        Arguments arguments = parseArgs(args);
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(arguments.getPort()), 0);
        httpServer.createContext("/", new MyHttpHandler(arguments));
        httpServer.setExecutor(Executors.newSingleThreadExecutor());
        httpServer.start();
    }
}
