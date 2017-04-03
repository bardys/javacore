package com.abardys.runners;

/**
 * Created by anbar on 30-Mar-17.
 */
public class ArraysRunner {
    public static void main(String[] args) {

        boolean[] booleanArray = {true, false, true};

        for (int i = 0; i < booleanArray.length; i++) {

            System.out.println(booleanArray[i]);
        }

        char[] charArray = {'1', 'a', '2'};

        for (int i = 0; i < charArray.length; i++) {

            System.out.println(charArray[i]);
        }

        double[] doubleArray = {1.1, 2.2, 3.3};

        for (int i = 0; i < doubleArray.length; i++) {

            System.out.println(doubleArray[i]);
        }

        long[] longArray = {100, 200, 300};

        for (int i = 0; i < longArray.length; i++) {

            System.out.println(longArray[i]);
        }
    }
}
