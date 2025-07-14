package org.example.task1;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetAPI {

   public static String useHttpClient() throws IOException, InterruptedException   {
        String soursUrl = "https://jsonplaceholder.typicode.com/users";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request =  HttpRequest.newBuilder()
                .uri(URI.create(soursUrl))
                .GET()
                .build();

       HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

       System.out.println(response.body());
       return response.body();
    }
}
