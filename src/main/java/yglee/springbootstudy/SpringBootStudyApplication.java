package yglee.springbootstudy;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;

public class SpringBootStudyApplication {
  public static void main(String[] args) {
    TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();
    WebServer webServer = serverFactory.getWebServer();
    webServer.start();
  }
}
