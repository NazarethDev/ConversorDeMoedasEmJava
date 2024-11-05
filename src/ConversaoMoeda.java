import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversaoMoeda {
    String base_code;
    String target_code;

    public ConversaoMoeda(String base_code,String target_code) {
        this.base_code = base_code;
        this.target_code = target_code;

    }

    public DadosUsados novaConversao(String base_code, String target_code) throws IOException, InterruptedException {
        URI novaConversao = URI.create("https://v6.exchangerate-api.com/v6/9b4337844cd4b206740957a1/pair/" + base_code + "/" + target_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(novaConversao)
                .build();
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), DadosUsados.class);

    }

}

