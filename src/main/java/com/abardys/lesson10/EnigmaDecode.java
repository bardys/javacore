package com.abardys.lesson10;

/**
 * Created by anbar on 16-May-17.
 */
public class EnigmaDecode {
    public static void main(String[] args) {
        String original = "abc";
        String code = "efd";
        String word = "";
        String result = "def";
        for (int i = 0; i < result.length(); i++) {
            char a = result.charAt(i);
            for (int j = 0; j < code.length(); j++) {
                if (a == code.charAt(j)) {
                    word += original.charAt(j);
                    break;
                }
            }
        }
        System.out.println(word);
    }
}
