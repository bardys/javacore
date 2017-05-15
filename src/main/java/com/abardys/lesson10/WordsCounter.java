package com.abardys.lesson10;

import java.util.Scanner;

/**
 * Created by anbar on 11-May-17.
 */
public class WordsCounter {
    public static void main(String[] args) {
        System.out.println("Enter statement: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splitedStringArrey = inputString.split(" ");
        System.out.println(splitedStringArrey.length);
    }
}
