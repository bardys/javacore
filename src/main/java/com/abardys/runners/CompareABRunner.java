package com.abardys.runners;

import com.abardys.app.lesson4.СompareCircleArea;
import com.abardys.app.lesson6.CompareAB;

import java.util.Scanner;

/**
 * Created by anbar on 23-Mar-17.
 */
public class CompareABRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();
        CompareAB.compare(a, b);
    }
}