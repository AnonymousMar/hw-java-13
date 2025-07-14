package org.example.getAPI.task2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;

public class TheLargestApi extends GetMethod{

    public static int FindTheLargestApi(String userJson) throws IOException{
      JsonArray posts = JsonParser.parseString(userJson).getAsJsonArray();

      int lastPost = -1;
        for (JsonElement post : posts) {
            JsonObject objectPost = post.getAsJsonObject();
            int postId = objectPost.get("id").getAsInt();
            if (postId > lastPost){
                lastPost = postId;
            }
        }
        return lastPost;
    }
}
