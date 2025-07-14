package org.example.task1;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NewObjectInAPI {

     public static void addNewObject(int id) throws IOException{

         String soursUrl = "https://jsonplaceholder.typicode.com/users";

         HttpClient client =  HttpClient.newHttpClient();

         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create(soursUrl))
                 .header("Content-Type", "application/json")
                 .POST(HttpRequest.BodyPublishers.ofString(
                        "{"
                                 + "\"id\":" +  id +  ","
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
             response =   client.send(request, HttpResponse.BodyHandlers.ofString());
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         System.out.println( response.body());
     }
}
