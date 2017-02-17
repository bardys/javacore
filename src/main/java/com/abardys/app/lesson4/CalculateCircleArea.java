package com.abardys.app.lesson4;

import java.util.Scanner;

/**
 * Created by anbar on 17-Feb-17.
 */
public class CalculateCircleArea {

    public static double calculate(String radius) {
        double rad = Double.parseDouble(radius);
        return Math.PI * (rad * rad);
    }



}

