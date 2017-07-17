package com.abardys.lesson8;

import java.util.Arrays;

/**
 * Created by anbar on 20-Apr-17.
 */
public class ASCIIArray {
    public static void main(String[] args) {
        char[] a = new char[128];
        for(int i = 0; i<a.length; i++){
            a[i] = (char) i;
        }
        /*Arrays.toString(a);*/
        System.out.println(a);

    }
}
