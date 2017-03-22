package com.abardys.app.lesson4;

import java.util.Scanner;

/**
 * Created by anbar on 16-Feb-17.
 */
public class Triangle {
    public  static boolean isTriangle(int a, int b, int c) {


        if (a > 0 || b > 0 || c > 0) {


            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }




}
