package org.example.task2;

import java.io.IOException;

public class APITest {
    public static void main(String[] args) throws IOException {
      String userJson = GetMethod.MethodGet(1,10);
        int lastPost =  TheLargestApi.FindTheLargestApi(userJson);

    }
}
