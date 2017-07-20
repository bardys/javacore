package com.abardys.lesson10;

import java.util.Scanner;

/**
 * Created by anbar on 11-May-17.
 */
public class StringBuilderPalindrom {
    public static void main(String[] args) {
        System.out.println("Enter word:");
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        st1 = st1.toLowerCase();

        StringBuilder palindrome = new StringBuilder(st1);
        System.out.println(palindrome);
        palindrome.reverse();
        System.out.println(palindrome);

        if (st1.equals(palindrome.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Polindrome");
        }
    }
}
