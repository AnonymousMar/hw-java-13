package org.example.task1;
import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PutMethod {

    public static void PutMethodInAPI() throws IIOException{

        String soursUrl = "https://jsonplaceholder.typicode.com/users/10"  ;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(soursUrl))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(
                        "{"
                                + "\"id\":" +  10 +  ","
                                + "\"name\": \"Leanne Graham\","
                                + "\"username\": \"Bret\","
                                + "\"email\": \"Sincere@april.biz\","
                                + "\"address\": {"
                                + "\"street\": \"Kulas Light\","
                                + "\"suite\": \"Apt. 556\","
                                + "\"city\": \"Gwenborough\","
                                + "\"zipcode\": \"92998-3874\","
                                + "\"geo\": {"
                                + "\"lat\": \"-37.3159\","
                                + "\"lng\": \"81.1496\""
                                + "}"
                                + "}"
                                + "}"
                ))
                .build();

        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("PUT Method" + response.body());
    }
}
