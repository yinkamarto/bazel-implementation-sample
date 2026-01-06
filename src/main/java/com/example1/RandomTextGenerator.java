package com.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class RandomTextGenerator {
    private static int TOTAL_FILES = 3;

    public static void main(String[] args) throws IOException {
        RandomTextGenerator randTextGen = new RandomTextGenerator();
        randTextGen.printText(randTextGen.getRandomNumber());
    }

    public void printText(int text_num) throws IOException {
        String fileName = "com/example1/resources/" + text_num + ".txt";
        InputStream resourcesStream = RandomTextGenerator.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourcesStream, StandardCharsets.UTF_8));

        String text;
        while((text = bufferedReader.readLine()) != null) {
            System.out.println(text);
            System.in.read();
        }
    }

    public int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(TOTAL_FILES - 1) + 1;
    }
    
}
