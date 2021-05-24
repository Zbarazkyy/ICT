import connection.ConnectionFloraatHome;
import connection.HttpURLConnectionWithoutToken;
import parser.Parser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {

        Parser.parserPath("D:\\Java\\ICT\\src\\main\\resources\\products.json");

        Parser.parser(HttpURLConnectionWithoutToken.connectionWithoutToken());

        ConnectionFloraatHome.connectionWithToken();




    }
}





