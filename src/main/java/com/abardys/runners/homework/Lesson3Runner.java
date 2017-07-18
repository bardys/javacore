package com.abardys.runners.homework;

import com.abardys.app.utils.convertors.PrimitiveConvertor;

import java.util.Scanner;

/**
 * Created by anbar on 08-Feb-17.
 */
public class Lesson3Runner {
    public static void lesson3Runner () {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        System.out.println("Input float: ");
        float float1 = scanner.nextFloat();
        System.out.println("Input int: ");
        int int1 = scanner.nextInt();
        System.out.println("Input char: ");
        char char3 = reader.next().charAt(0);

        primitiveConvertor.floatToChar(float1);
        primitiveConvertor.intToChar(int1);
        primitiveConvertor.charToInt(char3);
    }
}
