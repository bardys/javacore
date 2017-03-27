package com.abardys.app.utils.convertors;

/**
 * Created by anbar on 08-Feb-17.
 */
public class PrimitiveConvertor {
    public static char floatToChar(float float1) {
        char char1 = 0;
        char1 = (char)float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        return char1;
    }
    public static char intToChar(int int1){
        char char2 = 0;
        char2 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char2);
        return char2;
    }
    public static int charToInt(char char3){
        int int1 = 0;
        int1 = (int) char3;
        System.out.println("Input char value is " + char3 + ". Output int value is " + int1);
        return int1;
    }

}
