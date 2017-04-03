package com.abardys.runners.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by anbar on 03-Apr-17.
 */
public class Lesson6Runner {
    public static void main(String[] args) {
        int counterA = 0;
        for (int i = 2; i <= 20; i+=2){
            counterA++;
        }
        int[] aArray = new int[counterA];
        int valueA = 2;
        for (int i = 0; i < aArray.length; i++){
            aArray[i] = valueA;
            valueA+=2;
        }
        for(int arrElement : aArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");
        for(int arrElement : aArray){
            System.out.println(arrElement);

        }

        System.out.println("==========================================================");

        int counterB = 0;
        for (int i = 1; i <= 99; i+=2){
            counterB++;
        }
        int[] bArray = new int[counterB];
        int valueB = 1;
        for (int i = 0; i < bArray.length; i++){
            bArray[i] = valueB;
            valueB+=2;
        }
        for(int arrElement : bArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");
        for(int i=bArray.length-1; i>=0; i--){
            System.out.print(bArray[i] + " ");
        }

        System.out.println("");
        System.out.println("==========================================================");

        Random randC = new Random();

        int[] cArray = new int[15];
        for(int i=0; i < cArray.length; i++){
            int  nC = randC.nextInt(9);
            cArray[i] = nC;
        }

        for(int arrElement : cArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");
        int counterEven = 0;
        for(int i=0; i<cArray.length; i++){
            if(cArray[i]%2 == 0) {
                counterEven++;
            }
        }
        System.out.println(counterEven);

        System.out.println("==========================================================");

        Random randD = new Random();

        int[] dArray = new int[15];
        for(int i=0; i < dArray.length; i++){
            int  nD = randD.nextInt(999);
            dArray[i] = nD;
        }

        for(int arrElement : dArray) {
            System.out.print(arrElement + " ");
        }
        System.out.println("");

        int minD=999;
        int maxD=0;
        for(int arrElement : dArray) {
            if(arrElement<=minD){
                minD=arrElement;
            }
            if(arrElement>=maxD) {
                maxD = arrElement;
            }
        }
        System.out.println("min: " + minD);
        System.out.println("max: " + maxD);

    }
}
