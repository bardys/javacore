package com.abardys.app.lesson6;

/**
 * Created by anbar on 23-Mar-17.
 */
public class CompareAB {
    public static void compare (int a, int b){
        do{
            System.out.println(a + " " + b);
            a--;
        } while (a>=b);
    }
}