package com.abardys.app.lesson10;

public class EnigmaCode {
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
    private static final String CODE = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM67890zxcvbnm";

    private static String toEncode(String toCode, String original, String code) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < toCode.length(); i++) {
            char a = toCode.charAt(i);
            for (int j = 0; j < original.length(); j++) {
                if (a == original.charAt(j)) {
                    result.append(code.charAt(j));
                    break;
                }
            }
        }
        System.out.println(result);
        return result.toString();

    }

    public static String encode(String s) {
        return toEncode(s, ALPHABET, CODE);
    }

    public static String decode(String s) {
        return toEncode(s, CODE, ALPHABET);
    }


}



