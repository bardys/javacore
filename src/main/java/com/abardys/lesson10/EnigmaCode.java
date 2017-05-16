package com.abardys.lesson10;

/**
 * Created by anbar on 16-May-17.
 */
public class EnigmaCode {
    private static final String ALPHABET = "abc";
    private static final String CODE = "efd";

    private static String toEncode(String toCode, String original, String code) {
        String result = "";
        for (int i = 0; i < toCode.length(); i++) {
            char a = toCode.charAt(i);
            for (int j = 0; j < original.length(); j++) {
                if (a == original.charAt(j)) {
                    result += code.charAt(j);
                    break;
                }
            }
        }
        return result;
    }

    public static String encode(String s) {
        return toEncode(s, ALPHABET, CODE);
    }

    public static String decode(String s) {
        return toEncode(s, CODE, ALPHABET);
    }


}



