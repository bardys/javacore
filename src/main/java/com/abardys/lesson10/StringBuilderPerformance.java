package com.abardys.lesson10;

/**
 * Created by anbar on 11-May-17.
 */
public class StringBuilderPerformance {
    public static void main(String[] args) {
        StringBuilder c = new StringBuilder("start");
        String b = "finish";

        long start = System.currentTimeMillis();

        for (long i = 0; i < 100000L; i++)
            c = c.append(b);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
