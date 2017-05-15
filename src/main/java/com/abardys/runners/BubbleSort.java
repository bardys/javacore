package com.abardys.runners;

/**
 * Created by anbar on 18-Apr-17.
 */
public class BubbleSort {
    public static void main(String[] args) {

        boolean flag = true;
        int a[] = {58, 2, 8, 4, 67, 60, 56};
        for (int arrElement : a) {
            System.out.print(arrElement + " ");}
        while (flag) {
            flag = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                    flag = true;
                }
            }
            System.out.println("");
            for (int arrElement : a) {
                System.out.print(arrElement + " ");}
        }
        System.out.println("");
        for (int arrElement : a) {
            System.out.print(arrElement + " ");
        }

    }
}