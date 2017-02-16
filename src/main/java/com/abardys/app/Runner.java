package com.abardys.app;

/**
 * Created by anbar on 02-Feb-17.
 */
public class Runner {
    public static void main(String[] args) {
        WideningCasting casting1 = new WideningCasting();
        casting1.widening();

        NarrowingCasting narrowing1 = new NarrowingCasting();
        narrowing1.narrowing();
    }
}
