package com.abardys.lesson9.homework;

/**
 * Created by anbar on 17-Jul-17.
 */
public class Palindrome2 {
    String b = "";
    String c = "";

    public void checkPalindrome2(String palindrome2) {

        for(int i = 0; i < (int) palindrome2.length()/2; i++){
            b=b+palindrome2.charAt(palindrome2.length()-i-1);
            c=c+palindrome2.charAt(i);
        }
        if(b.equals(c)){
            System.out.println("Palindrome2: Palindrome");
        }else{
            System.out.println("Palindrome2: Not Polindrome");
        }
    }
}
