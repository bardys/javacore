package com.abardys.runners.homework;

import java.util.Random;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6GRunner {
    public static void main(String[] args) {
        Random randG = new Random();

        int[][] gArray = new int[8][5];
        for (int j = 0; j < gArray.length; j++) {
            for (int k = 0; k < gArray[j].length; k++) {
                int nG = randG.nextInt(999) + 1;
                gArray[j][k] = nG;
            }
        }

        for (int j = 0; j < gArray.length; j++) {
            for (int k = 0; k < gArray[j].length; k++) {
                if (gArray[j][k] < 10) {
                    System.out.print(" " + " " + gArray[j][k] + " ");
                } else if (gArray[j][k] < 100 && gArray[j][k] > 9) {
                    System.out.print(" " + gArray[j][k] + " ");
                } else {
                    System.out.print(gArray[j][k] + " ");
                }
            }
            System.out.println("");
        }
    }
}
