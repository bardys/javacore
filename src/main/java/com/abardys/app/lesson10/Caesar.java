package com.abardys.app.lesson10;

/**
 * Created by anbar on 16-May-17.
 */
public class Caesar {

    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";

    public static String toEncode(String toCode, int n) {
        StringBuilder result = new StringBuilder("");
        int ost = n % ALPHABET.length();
        System.out.println("Shift = " + ost);
        for (int i = 0; i < toCode.length(); i++) {
            char code = toCode.charAt(i);
            for (int j = 0; j < ALPHABET.length(); j++) {
                if (code == ALPHABET.charAt(j)) {
                    result.append(ALPHABET.charAt((j + n) % ALPHABET.length()));
                    break;
                }
            }
        }
        System.out.println(result);
        return result.toString();
    }

    public static String toDecode(String toCode, int n) {
        StringBuilder result = new StringBuilder("");
        int ost = n % ALPHABET.length();
        System.out.println("Shift = " + ost);
        for (int i = 0; i < toCode.length(); i++) {
            char code = toCode.charAt(i);
            for (int j = 0; j < ALPHABET.length(); j++) {
                if (code == ALPHABET.charAt(j)) {
                    result.append(ALPHABET.charAt((j - n + ALPHABET.length()*n) % ALPHABET.length()));
                    break;
                }
            }
        }
        System.out.println(result);
        return result.toString();
    }
}
