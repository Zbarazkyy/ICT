package connection;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionWithoutToken {

    public static InputStream connectionWithoutToken(){

        URL url = null;
        try {
            url = new URL("https://api.floraathome.nl/v2.0//products/get");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream responseStream = null;
        try {
            responseStream = connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseStream;
    }

}
