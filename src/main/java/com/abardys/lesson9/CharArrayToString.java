package com.abardys.lesson9;

/**
 * Created by anbar on 27-Apr-17.
 */
public class CharArrayToString {
    public static void main(String[] args) {



        char[] charArrayToString = {'a', 'b', 'c', 'd'};

        String stringToDisplay = new String(charArrayToString);

//        for (int i = 0; i < charArrayToString.length; i++) {
//
//            stringToDisplay += charArrayToString[i];
//
//        }

        System.out.println(stringToDisplay);
    }
}
