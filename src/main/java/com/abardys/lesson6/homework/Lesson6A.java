package com.abardys.lesson6.homework;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6A {
    public  static void lesson6A() {
        int counterA = 0;
        for (int i = 2; i <= 20; i += 2) {
            counterA++;
        }
        int[] aArray = new int[counterA];
        int valueA = 2;
        for (int i = 0; i < aArray.length; i++) {
            aArray[i] = valueA;
            valueA += 2;
        }
        for (int arrElement : aArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");
        for (int arrElement : aArray) {
            System.out.println(arrElement);

        }
    }
}
