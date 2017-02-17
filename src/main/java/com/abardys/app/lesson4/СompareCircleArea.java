package com.abardys.app.lesson4;

import java.util.Scanner;

/**
 * Created by anbar on 16-Feb-17.
 */

public class СompareCircleArea {
    public static final double PI = 3.14;

    public static void calculateBigger(double radius1, double radius2) {
        double circleArea1 = PI * radius1 * radius1;
        double circleArea2 = PI * radius2 * radius2;
        if (circleArea1 > circleArea2) {
            System.out.println("Area1 is bigger");
        } else if (circleArea1 < circleArea2) {
            System.out.println("Area2 is bigger");
        } else {
            System.out.println("Area1 equals Area2");
        }
    }
}
