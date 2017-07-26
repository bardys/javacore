package com.abardys.lesson17.homework;

import java.util.Scanner;

import static com.abardys.lesson17.homework.Category.names;
import static com.abardys.lesson17.homework.Phonebook.categories;

/**
 * Created by anbar on 26-Jul-17.
 */
public class PhonebookRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String cat = "";

        if(categories.size() != 0) {
            System.out.println("Your categories:");
            for (Object element : categories) {
                System.out.println(element);
            }
        }else{
            System.out.println("You have no categories!");
        }

        while(true) {
            System.out.println("Enter category:");
            cat = scanner.nextLine();

            if (!cat.equals("exit") && !cat.equals("")) {
                for (Object categoryElement : categories) {
                    if (!cat.equals(Category.getCategoryName())) {
                        Phonebook.addCategory(cat);
                    } else {
                        for (Object nameElement : names) {
                            System.out.println(Name.getNameName());
                            System.out.println(Name.getPhones());
                        }
                    }
                }
            }else{
                System.out.println("Bye!");
                break;
            }
        }


    }
}
