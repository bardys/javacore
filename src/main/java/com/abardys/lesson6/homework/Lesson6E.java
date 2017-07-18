package com.abardys.lesson6.homework;

import java.util.Random;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6E {
    public static void lesson6E() {
        Random randE = new Random();

        int[][] eArray = new int[8][5];
        for (int j = 0; j < eArray.length; j++) {
            for (int k = 0; k < eArray[j].length; k++) {
                int nE = randE.nextInt(90) + 10;
                eArray[j][k] = nE;
            }
        }

        for (int j = 0; j < eArray.length; j++) {
            for (int k = 0; k < eArray[j].length; k++) {
                System.out.print(eArray[j][k] + " ");
            }
            System.out.println("");
        }
    }
}
