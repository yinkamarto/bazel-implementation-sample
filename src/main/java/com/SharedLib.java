package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class SharedLib {
    public static void printText(int total_files) throws IOException {
        int text_file_index = getRandomNumber(total_files);
        String fileName = "com/example1/resources/" + text_file_index + ".txt";
        InputStream resourcesStream = SharedLib.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourcesStream, StandardCharsets.UTF_8));

        String text;
        while((text = bufferedReader.readLine()) != null) {
            System.out.println(text);
            System.in.read();
        }
    }
    public static int getRandomNumber(int total_files) {
        Random rand = new Random();
        return rand.nextInt(total_files - 1) + 1;
    }
}
