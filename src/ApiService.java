import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class ApiService {

    private final String API_KEY = System.getenv("EXCHANGE_API_KEY");

    public double getTaxaCambio(String origem, String destino) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + origem;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JSONObject json = new JSONObject(response.body());

        return json.getJSONObject("conversion_rates").getDouble(destino);
    }
}
