package com.abardys.runners.homework;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6BRunner {
    public static void main(String[] args) {
        int counterB = 0;
        for (int i = 1; i <= 99; i += 2) {
            counterB++;
        }
        int[] bArray = new int[counterB];
        int valueB = 1;
        for (int i = 0; i < bArray.length; i++) {
            bArray[i] = valueB;
            valueB += 2;
        }
        for (int arrElement : bArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");
        for (int i = bArray.length - 1; i >= 0; i--) {
            System.out.print(bArray[i] + " ");
        }
    }
}
