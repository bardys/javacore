package com.abardys.runners.homework;

import com.abardys.lesson9.homework.Palindrome1;
import com.abardys.lesson9.homework.Palindrome2;
import com.abardys.lesson9.homework.Palindrome3;

import java.util.Scanner;

/**
 * Created by anbar on 18-Jul-17.
 */
public class Lesson9Runner {
    public static void lesson9Runner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        Palindrome1 palindrome1 = new Palindrome1();
        Palindrome2 palindrome2 = new Palindrome2();
        Palindrome3 palindrome3 = new Palindrome3();

        try {
            String enter = scanner.nextLine();
            String newEnter = enter.toLowerCase();
            System.out.println(enter);
            palindrome1.checkPalindrome1(newEnter);
            palindrome2.checkPalindrome2(newEnter);
            palindrome3.checkPalindrome3(newEnter);
        }catch (Exception e) {
            System.out.println("WRONG ENTER!!!! AAAAAAAAAAA!!!!!!!!!");
        }
    }
}
