package com.abardys.lesson9.homework;

/**
 * Created by anbar on 17-Jul-17.
 */
public class Palindrome1 {

    boolean isPalindrome = true;

    public void checkPalindrome1(String palindrome1) {
        for (int i = 0; i < palindrome1.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (palindrome1.charAt(i) == palindrome1.charAt
                            (palindrome1.length() - i - 1));
        }

        if (isPalindrome) {
            System.out.println("Palindrome1: Palindrome");
        } else {
            System.out.println("Palindrome1: Not palindrome");
        }
    }
}
