package com.abardys.app.lesson4;

import java.util.Scanner;

import static com.abardys.app.lesson4.СompareCircleArea.calculateBigger;

/**
 * Created by anbar on 17-Feb-17.
 */
public class CompareCircleAreaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius1: ");
        double radius1 = scanner.nextDouble();
        System.out.println("Input radius2: ");
        double radius2 = scanner.nextDouble();
        СompareCircleArea.calculateBigger(radius1, radius2);
    }
}
