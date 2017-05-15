package com.abardys.lesson10;

/**
 * Created by anbar on 11-May-17.
 */
public class StringPerformance {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String c = "start";

        String b = "finish";

        for (long i = 0; i < 100000L; i++) {
            c = c.concat(b);
        }


    }
}