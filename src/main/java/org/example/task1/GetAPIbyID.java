package org.example.getAPI.task1;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetAPIbyID {

    public static String GetByID(int id) throws IOException, InterruptedException {
        String soursUrl = "https://jsonplaceholder.typicode.com/users/" + id;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(soursUrl))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("GET by ID  = " + response.body());
        return response.body();
    }
}
