package com.abardys.runners.homework;

import java.util.Scanner;

import static com.abardys.app.finalProject.University.*;

/**
 * Created by anbar on 09-Aug-17.
 */
public class FinalProjectRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String universityMenu = "";
        readFile();

        while (!universityMenu.equals("exit")) {
            System.out.println("******************************************************************************");
            System.out.println("To add person press \"1\"");
            System.out.println("To edit person press \"2\"");
            System.out.println("To delete person press \"3\"");
            System.out.println("To  search press \"4\"");
            System.out.println("To see reference information press \"5\"");
            System.out.println("To exit enter \"exit\"");

            universityMenu = scanner.nextLine();


            switch (universityMenu) {
                case "1":
                    addPersone();
                    break;
                case "2":
                    editPersonMenu();
                    break;
                case "3":
                    deletePersonMenu();
                    break;
                case "4":
                    searchMenu();
                    break;
                case "5":
                    information();
                    break;
                case "exit" :
                    writeFile();
                    break;
                default:
                    System.out.println("Wrong enter");

            }
        }

    }
}
