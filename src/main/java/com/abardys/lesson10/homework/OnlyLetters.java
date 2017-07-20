package com.abardys.lesson10.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anbar on 20-Jul-17.
 */
public class OnlyLetters {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void onlyLetters() {
        System.out.println("Enter symbols delimited by \";\":");

        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < enter.length(); i++) {
            char a = enter.charAt(i);
            for (int j = 0; j < ALPHABET.length(); j++) {
                if (a == ALPHABET.charAt(j)) {
                    result.append(ALPHABET.charAt(j));
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
