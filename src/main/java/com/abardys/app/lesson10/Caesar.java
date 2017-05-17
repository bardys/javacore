package com.abardys.app.lesson10;

/**
 * Created by anbar on 16-May-17.
 */
public class Caesar {
    public static String toEncode(String toCode, int n) {
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        String result = "";
        int ost = n % alphabet.length();
        System.out.println("Shift = " + ost);
        for (int i = 0; i<toCode.length(); i++){
            char code = toCode.charAt(i);
            for(int j=0; j<alphabet.length(); j++){
                if(code == alphabet.charAt(j)){
                    result += alphabet.charAt((j+n)%alphabet.length());
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }

//    public static String toEncode(String s, int n) {
//        return toEncode(s, ALPHABET, n);
//    }
//
//    public static String decode(String s, int n) {
//        return toEncode(s, ALPHABET, n);
//    }
}
