package org.example.getAPI.task3;

import javax.imageio.IIOException;

public class ApiTests {

    public static void main(String[] args) throws IIOException {
      String  userJson =  GetMethod3.GetMethodFor3Task(3);
        CheckForTask.CheckTask(userJson);
    }
}
