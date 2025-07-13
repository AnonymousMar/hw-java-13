package org.example.getAPI.task1;
import java.io.IOException;

public class API {

    public static void main(String[] args) throws IOException, InterruptedException {
        String userJson =  GetAPI.useHttpClient();
       int maxId =  TheBiggestAPI.getTheBiggestAPI(userJson);
       NewObjectInAPI.addNewObject(maxId + 1);
       PutMethod.PutMethodInAPI();
       DeleteObject.DeleteObjects();
       GetAPIbyID.GetByID(9);
       GetByUsername.GetByUsernameMethod("Kamren");
    }
}
