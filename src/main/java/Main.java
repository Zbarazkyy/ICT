import connection.HttpURLConnectionWithoutToken;
import parser.Parser;

public class Main {
    public static void main(String[] args) {

        Parser.parserPath("D:\\Java\\ICT\\src\\main\\resources\\products.json");

        Parser.parser(HttpURLConnectionWithoutToken.connectionWithoutToken());


    }
}





