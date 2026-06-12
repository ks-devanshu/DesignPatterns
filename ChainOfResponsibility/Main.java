package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var webServer = new WebServer(authenticator);

        webServer.handle(new HttpRequest("admin","1234"));
    }
}
