package org.example.task2;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetMethod {

    public static String MethodGet(int userId, int postId) throws IOException {
        String soursUrl = "https://jsonplaceholder.typicode.com/users/" + userId + "/posts";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(soursUrl))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String fileName = "user-" + userId + "-post-" + postId + "-comments.json";
           try(FileWriter fileWriter = new FileWriter(fileName)){
               fileWriter.write(response.body());
           }
            System.out.println("response.body() = " + response.body());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
