package com.example1;

import java.io.IOException;

import com.SharedLib;

public class RandomTextGenerator {
    private static int TOTAL_FILES = 3;

    public static void main(String[] args) throws IOException {
        SharedLib.printText(TOTAL_FILES);
    }

    public static void printRandText(int text_num) throws IOException {
        SharedLib.printText(text_num);
    }
}
