package com.abardys.lesson10.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anbar on 20-Jul-17.
 */
public class KeyWord {
    public static void keyWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phrase:");
        String phrase = scanner.nextLine();
        System.out.println("Enter keyword:");
        String keyWord = scanner.nextLine();

        String[] enterArray = phrase.split(keyWord + " ");

        for (String element : enterArray) {
                System.out.println(element);
        }

    }
}