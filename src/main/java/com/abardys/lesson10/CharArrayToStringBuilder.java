package com.abardys.lesson10;

/**
 * Created by anbar on 18-Jul-17.
 */
public class CharArrayToStringBuilder {
    public static void main(String[] args) {

        char[] charArrayToString = {'a', 'b', 'c', 'd'};

        StringBuilder builder = new StringBuilder();

        for (char value : charArrayToString) {

            builder.append(value);

        }
        System.out.println(builder);
    }
}
