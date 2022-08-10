package com.Lesson3;

import java.util.Scanner;

public class Shifr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int key = 9;
        for (int i = 0; i < input.length(); i++){
            char symbol = input.charAt(i);
            char encodeSymbol = (char) (symbol + key);
            System.out.print(encodeSymbol);
        }






    }
}

