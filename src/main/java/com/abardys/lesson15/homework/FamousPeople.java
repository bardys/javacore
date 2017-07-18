package com.abardys.lesson15.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by anbar on 04-Jul-17.
 */
public class FamousPeople {
    public static void famousPeople() {
        Random rand = new Random();

        FamousPeopleEnum[] enumArray = new FamousPeopleEnum[5];
        enumArray = FamousPeopleEnum.values();

        int actualIndex = 10;
        int previousIndex = 10;
        int correctAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while(correctAnswers != 3) {
            int n = rand.nextInt(5);
            while(n == actualIndex || n == previousIndex){
                n = rand.nextInt(5);
            }
            System.out.println(enumArray[n]);
            actualIndex = n;
            
            if(correctAnswers == 0) {
                previousIndex = n;
            }

            System.out.println("Enter age:");
            int ageChoice = scanner.nextInt();
            FamousPeopleEnum famousPeopleEnum = FamousPeopleEnum.values()[n];
            int age = famousPeopleEnum.getAge();

            if(ageChoice == age) {
                System.out.println("Correct!");
                System.out.println("Alive?");
                String lifeStatusChoice = scanner2.nextLine().toUpperCase();
                String lifeStatus = famousPeopleEnum.getLifeStatus();

                if(lifeStatusChoice.equals(lifeStatus)){
                    System.out.println("Correct!");
                    correctAnswers++;
            }else{
                    System.out.println("No...");
                }


            }else{
                System.out.println("No...");
            }
        }
        System.out.println("You win!!!");
    }

}

