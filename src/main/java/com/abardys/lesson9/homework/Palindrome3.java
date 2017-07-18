package com.abardys.lesson9.homework;

/**
 * Created by anbar on 17-Jul-17.
 */
public class Palindrome3 {

    String b = "";
    public void checkPalindrome3(String palindrome3) {
        for(int i = 0; i<palindrome3.length(); i++){
            b=b+palindrome3.charAt(palindrome3.length()-i-1);
        }
        if(palindrome3.equals(b)){
            System.out.println("Palindrome3: Palindrome");
        }else{
            System.out.println("Palindrome3: Not Polindrome");
        }
    }
}
