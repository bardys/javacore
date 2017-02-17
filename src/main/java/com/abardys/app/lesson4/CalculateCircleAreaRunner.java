package com.abardys.app.lesson4;

import java.util.Scanner;

import static com.abardys.app.lesson4.CalculateCircleArea.calculate;

/**
 * Created by anbar on 17-Feb-17.
 */
public class CalculateCircleAreaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        String radius = scanner.next();
        double zlo = CalculateCircleArea.calculate(radius);
        System.out.println("Area is " + zlo);
    }

}
