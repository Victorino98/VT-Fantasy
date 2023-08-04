package vtfantasy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

import java.io.OutputStream;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.Headers;

public class HtmlHandler implements HttpHandler {
  @Override
  public void handle(HttpExchange t) throws IOException {
    Headers h = t.getResponseHeaders();
    String response = "";
    String line = "";
    InputStream is;

    try {
      switch (t.getRequestURI().getPath()){
        case "/login":
          is = getClass().getClassLoader().getResourceAsStream("html/login.html");
          break;
        default:
          is = getClass().getClassLoader().getResourceAsStream("html/login.html");;
      }

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
      while ((line = bufferedReader.readLine()) != null){
        response += line;
      }
      bufferedReader.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }

    h.add("Content-Type", "text/html");
    t.sendResponseHeaders(200, response.length());
    OutputStream os = t.getResponseBody();
    os.write(response.getBytes());
    os.close();
  }
}
