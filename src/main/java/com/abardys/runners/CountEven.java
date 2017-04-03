package com.abardys.runners;

/**
 * Created by anbar on 28-Mar-17.
 */
public class CountEven {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; i<=20; i+=2) {
            ++counter;
        }
        System.out.println(counter);
    }
}
