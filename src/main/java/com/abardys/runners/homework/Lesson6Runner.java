package com.abardys.runners.homework;

import com.abardys.runners.CalculateCircleAreaRunner;
import com.abardys.runners.CompareCircleAreaRunner;
import com.abardys.runners.TriangleRunner;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
            int  nC = randC.nextInt(10);
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
            int  nD = randD.nextInt(1000);
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

        System.out.println("==========================================================");

        Random randE = new Random();

        int[][] eArray = new int[8][5];
        for(int j=0; j < eArray.length; j++){
            for (int k=0; k<eArray[j].length; k++) {
                int nE = randE.nextInt(90) + 10;
                eArray[j][k] = nE;
            }
        }

        for(int j=0; j < eArray.length; j++) {
            for (int k = 0; k < eArray[j].length; k++) {
                System.out.print(eArray[j][k] + " ");
            }
            System.out.println("");
        }

        System.out.println("==========================================================");

        Random randG = new Random();

        int[][] gArray = new int[8][5];
        for(int j=0; j < gArray.length; j++){
            for (int k=0; k<gArray[j].length; k++) {
                int nG = randG.nextInt(999) + 1;
                gArray[j][k] = nG;
            }
        }

        for(int j=0; j < gArray.length; j++) {
            for (int k = 0; k < gArray[j].length; k++) {
                if(gArray[j][k] < 10){
                System.out.print(" " + " " + gArray[j][k] + " ");}
                else if(gArray[j][k] < 100 && gArray[j][k] > 9){
                    System.out.print(" " + gArray[j][k] + " ");}
                else{
                    System.out.print(gArray[j][k] + " ");}
            }
            System.out.println("");
        }

        System.out.println("==========================================================");

        int[] hArray = new int[15];
        try {
            for (int i = 0; i < hArray.length; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number or write 'exit': ");
                int choice = scanner.nextInt();
                hArray[i] = choice;
            }
        }
        catch (Exception e) {
            int sum = 0;
            for (int i = 0; i < hArray.length; i++) {
                sum = sum + hArray[i];
            }
            System.out.println(sum);
        }
    }
}
