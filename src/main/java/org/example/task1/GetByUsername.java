package org.example.getAPI.task1;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetByUsername {

    public static String GetByUsernameMethod(String username) throws IOException{
        String soursUrl = "https://jsonplaceholder.typicode.com/users?username=" + username ;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(soursUrl))
                .GET()
                .build();

        try {
            HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("GET by username = " + response.body());
            return response.body();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
