package Fruit;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpRequest {

    private static final String baseUriString = "https://www.fruityvice.com/api/fruit/";

    public static Fruit getFruit(String name) {

        StringBuffer response = new StringBuffer();
        String url = baseUriString + name;
        Gson gson =  new GsonBuilder().setPrettyPrinting().create();
        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("Response: " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } catch (MalformedURLException ex) {
            System.out.println("Bad url");

        } catch (IOException ex) {
            System.out.println("Connection failed");
        }

        System.out.println(response);

        return gson.fromJson(response.toString(), Fruit.class);
    }


}

