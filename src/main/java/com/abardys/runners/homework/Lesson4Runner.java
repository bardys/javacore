package com.abardys.runners.homework;

import com.abardys.runners.CalculateCircleAreaRunner;
import com.abardys.runners.CompareCircleAreaRunner;
import com.abardys.runners.TriangleRunner;

import java.util.Scanner;

/**
 * Created by User on 19.02.2017.
 */
public class Lesson4Runner {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter program number: 1, 2 or 3\nTo Calculate Circle Area enter 1;\nTo Сompare Circle Area enter 2;\nTo Verify Is Triangle Right-Angled enter 3\nYour choice: ");
            try {
                int choice = scanner.nextInt();
                /*if (choice == 1) {
                    CalculateCircleAreaRunner.main();
                } else if (choice == 2) {
                    CompareCircleAreaRunner.main();
                } else if (choice == 3) {
                    TriangleRunner.main();
                } else {
                    System.out.println("Wrong enter");
                }*/
                switch (choice) {
                    case 1:
                        CalculateCircleAreaRunner.main();
                        break;
                    case 2:
                        CompareCircleAreaRunner.main();
                        break;
                    case 3:
                        TriangleRunner.main();
                        break;
                    default:
                        System.out.println("Wrong enter");
                }
            } catch (Exception e) {
                System.out.println("Wrong enter");
            }
        }


    }
}
