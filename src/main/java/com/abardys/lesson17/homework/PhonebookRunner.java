package com.abardys.lesson17.homework;

import java.util.Scanner;



import static com.abardys.lesson17.homework.Category.names;
import static com.abardys.lesson17.homework.Name.phones;
import static com.abardys.lesson17.homework.Phonebook.categories;

/**
 * Created by anbar on 26-Jul-17.
 */
public class PhonebookRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String cat = "";
        boolean categoryFlag = true;

        if(!categories.isEmpty()) {
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
                if(!categories.isEmpty()) {
                    for (int i = 0; i<categories.size(); i++) {
                        categoryFlag = false;
                        Object ct = categories.get(i);
                        if (cat.equals(Category.getCategoryName())) {
                            if (!names.isEmpty()) {
                                for (Object nameElement : names) {
                                    System.out.println(Name.getNameName());
                                    if (!phones.isEmpty()) {
                                        System.out.println(Name.getPhones());

                                    } else {
                                        System.out.println("No phones for this name");
                                    }
                                }
                            } else {
                                System.out.println("No names in this category");
                            }
                            categoryFlag = true;
                            break;
                        }
                    }
                    if(categoryFlag == false){
                        Phonebook.addCategory(cat);
                        System.out.println("No names in this category");
                    }

                }else{Phonebook.addCategory(cat);
                    System.out.println("No names in this category");}
            }else{
                System.out.println("Bye!");
                break;
            }
        }


    }
}
