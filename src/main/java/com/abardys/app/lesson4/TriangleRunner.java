package com.abardys.app.lesson4;

import java.util.Scanner;

/**
 * Created by anbar on 16-Feb-17.
 */
public class TriangleRunner {
    public static void main() {
        Triangle runTriangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();
        System.out.println("Input c: ");
        int c = scanner.nextInt();

        runTriangle.isTriangle(a,b,c);

        if (runTriangle.isTriangle(a,b,c)){
            System.out.println("Triangle is right-angled");
        } else {
            System.out.println("Triangle is not right-angled");
        }

    }
}
