package com.abardys.runners.homework;

import java.util.Scanner;

/**
 * Created by anbar on 18-Jul-17.
 */
public class HomeTaskRunner {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter hometask number:");

            for (HomeTaskRunnerEnum value : HomeTaskRunnerEnum.values()) {
                System.out.print(value + ", ");
            }
            try {
                String enter = scanner.nextLine();
                HomeTaskRunnerEnum homeTaskRunnerEnum = HomeTaskRunnerEnum.valueOf(enter.toUpperCase());
                switch(homeTaskRunnerEnum){
                    case ONE:
                        System.out.println("There is no hometast of this lesson");
                        break;
                    case TWO:
                        System.out.println("There is no hometast of this lesson");
                        break;
                    case THREE:
                        Lesson3Runner.lesson3Runner();
                        break;
                    case FOUR:
                        Lesson4Runner.lesson4Runner();
                        break;
                    case FIVE:
                        System.out.println("There is no hometast of this lesson");
                        break;
                    case SIX:
                        Lesson6Runner.lesson6Runner();
                        break;
                    case SEVEN:
                        System.out.println("There is no hometast of this lesson");
                        break;
                    case EIGHT:
                        Lesson8Runner.lesson8Runner();
                        break;
                    case NINE:
                        Lesson9Runner.lesson9Runner();
                        break;
                    case TEN:
                        Lesson10Runner.lesson10Runner();
                        break;
                    case ELEVEN:
                        Lesson11Runner.lesson11Runner();
                        break;
                    case TWELVE:
                        Lesson12Runner.lesson12Runner();
                        break;
                    case THIRTEEN:
                        Lesson12Runner.lesson12Runner();
                        break;
                    case FOURTEEN:
                        Lesson14Runner.lesson14Runner();
                        break;
                    case FIFTEEN:
                        Lesson15Runner.lesson15Runner();
                        break;
                    case SIXTEEN:
                        Lesson16Runner.lesson16Runner();
                        break;
                    case SEVENTEEN:


                }

            } catch (IllegalArgumentException e) {
                System.out.println("WRONG ENTER!!!! AAAAAAAAAAA!!!!!!!!!");
            }
        }


    }
}
