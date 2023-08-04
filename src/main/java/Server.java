package vtfantasy;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class Server {

    public static void main(String[] args) throws Exception {
        // Start Server
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Create Paths
        server.createContext("/", new HtmlHandler());
        server.createContext("/login", new HtmlHandler());

        server.setExecutor(null);
        server.start();
    }
}
