package org.example.getAPI.task1;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.imageio.IIOException;

public class TheBiggestAPI extends GetAPI {

    public static int getTheBiggestAPI(String userJson) throws IIOException {
       JsonArray users = JsonParser.parseString(userJson).getAsJsonArray();

        int maxId = 0;
        for (int i = 0; i < users.size(); i++) {
            JsonObject user = users.get(i).getAsJsonObject();
            int id = user.get("id").getAsInt();
            if (id > maxId){
                maxId = id;
            }
        }
        return maxId;
    }
}
