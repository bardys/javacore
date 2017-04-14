package com.abardys.runners.homework;

import java.util.Random;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6CRunner {
    public static void main(String[] args) {
        Random randC = new Random();

        int[] cArray = new int[15];
        for (int i = 0; i < cArray.length; i++) {
            int nC = randC.nextInt(10);
            cArray[i] = nC;
        }

        for (int arrElement : cArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");
        int counterEven = 0;
        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] % 2 == 0) {
                counterEven++;
            }
        }
        System.out.println(counterEven + " even numbers");
    }
}
