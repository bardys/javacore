package com.abardys.lesson6.homework;

import java.util.Random;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6D {
    public static void lesson6D() {
        Random randD = new Random();

        int[] dArray = new int[15];
        for (int i = 0; i < dArray.length; i++) {
            int nD = randD.nextInt(1000);
            dArray[i] = nD;
        }

        for (int arrElement : dArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");

        int minD = 999;
        int maxD = 0;
        for (int arrElement : dArray) {
            if (arrElement <= minD) {
                minD = arrElement;
            }
            if (arrElement >= maxD) {
                maxD = arrElement;
            }
        }
        System.out.println("min: " + minD);
        System.out.println("max: " + maxD);
    }
}
