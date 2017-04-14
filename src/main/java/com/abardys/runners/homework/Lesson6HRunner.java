package com.abardys.runners.homework;

import java.util.Scanner;

/**
 * Created by anbar on 14-Apr-17.
 */
public class Lesson6HRunner {
    public static void main(String[] args) {
        int sum = 0;
        int[] hArray = new int[1];

        for (int i = 0; i < hArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number or write 'exit': ");
            String choice = scanner.next();
            if (choice.toLowerCase().equals("exit")) {
                for (int k = 0; k < hArray.length; k++) {
                    sum = sum + hArray[k];
                }
                System.out.println(sum);
                break;
            }

            hArray[i] = Integer.parseInt(choice);
            int[] newArray = new int[hArray.length + 1];
            for (int n = 0; n < hArray.length; n++) {
                newArray[n] = hArray[n];
            }
            hArray = newArray;

        }
    }
}
