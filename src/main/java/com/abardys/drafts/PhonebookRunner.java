package com.abardys.drafts;

import java.util.Scanner;

/**
 * Created by anbar on 26-Jul-17.
 */
public class PhonebookRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String cat = "";
        boolean categoryFlag = true;

        if(!PhonebookObjects.categories.isEmpty()) {
            System.out.println("Your categories:");
            for (Object element : PhonebookObjects.categories) {
                System.out.println(element);
            }
        }else{
            System.out.println("You have no categories!");
        }

        while(true) {
            System.out.println("Enter category:");
            cat = scanner.nextLine();

            if (!cat.equals("exit") && !cat.equals("")) {
                if(!PhonebookObjects.categories.isEmpty()) {
                    for (int i = 0; i< PhonebookObjects.categories.size(); i++) {
                        categoryFlag = false;
                        Object ct = PhonebookObjects.categories.get(i);
                        if (cat.equals(Category.getCategoryName())) {
                            if (!Category.names.isEmpty()) {
                                for (Object nameElement : Category.names) {
                                    System.out.println(Name.getNameName());
                                    if (!Name.phones.isEmpty()) {
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
                        PhonebookObjects.addCategory(cat);
                        System.out.println("No names in this category");
                    }

                }else{
                    PhonebookObjects.addCategory(cat);
                    System.out.println("No names in this category");}
            }else{
                System.out.println("Bye!");
                break;
            }
        }


    }
}
