package connection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class ConnectionFloraatHome {

    public static void connectionWithToken(){
    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.floraathome.nl/v2.0/products/get"))
            .GET()
            .header("apitoken", "38c5920c-e4be-4a79-ac17-6eb0a021679e")
            .header("Accept", "application/json")

            .build();

    HttpResponse<String> response = null;
        try {
        response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
    } catch (IOException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println(response.body());
    }
}