package org.example.task3;

import com.google.gson.*;

public class CheckForTask {

    public static void CheckTask(String userJson){
        JsonArray arrays = JsonParser.parseString(userJson).getAsJsonArray();

        for (JsonElement array : arrays) {
            JsonObject objectPost = array.getAsJsonObject();
         boolean completed = objectPost.get("completed").getAsBoolean();
         if (!completed){
             System.out.println(objectPost.toString());
         }

        }
    }
}
