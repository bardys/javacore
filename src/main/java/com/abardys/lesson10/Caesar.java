package com.abardys.lesson10;

/**
 * Created by anbar on 16-May-17.
 */
public class Caesar {
    public static void main(String[] args) {
        String alphabet = "abcdef";
        String word = "cat";
        String result = "";
        int n = 138;
        int ost = n % alphabet.length();
        System.out.println(ost);
        for (int i = 0; i<alphabet.length(); i++){
            char code = word.charAt(i);
            for(int j=0; j<alphabet.length(); j++){
                if(code == alphabet.charAt(j)){
                    result += alphabet.charAt((j+n)%alphabet.length());
                }
            }
        }
    }
}
