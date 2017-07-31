package com.abardys.lesson17.homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by User on 31.07.2017.
 */
public class Phonebook2 {
    public static void main(String[] args) {
        Map<String, Map<String, Map<String, String>>> categories = new HashMap<>();
        Map<String, Map<String, String>> names = new HashMap<>();
        Map<String, String> phones = new HashMap<>();

        String cat = "";
        String nam = "";
        String num = "";
        String mar = "";

        Scanner scanner = new Scanner(System.in);


        if (!categories.isEmpty()) {
            System.out.println("Your categories:");
            System.out.println(categories.keySet());

        } else {
            System.out.println("You have no categories!");
        }

        while (true) {
            System.out.println("Enter category:");
            cat = scanner.nextLine();

            if (!cat.equals("exit") && !cat.equals("")) {
                if (categories.containsKey(cat)) {
                    System.out.println(categories.get(cat));
                } else {
                    categories.put(cat, names);
                    System.out.println("New category was added!");
                    while (true) {
                        System.out.println("Enter name:");
                        nam = scanner.nextLine();
                        if (!nam.equals("exit") && !nam.equals("")) {
                            if (categories.get(cat).containsKey(nam)) {
                                System.out.println(categories.get(cat).get(nam));
                            } else {
                                categories.get(cat).put(nam, phones);
                                System.out.println("New name was added");
                                while (true) {
                                    System.out.println("Enter phone number");
                                    num = scanner.nextLine();
                                    if (!num.equals("exit") && !num.equals("")) {
                                        if (categories.get(cat).get(nam).containsKey(num)) {
                                            System.out.println(num + " " + categories.get(cat).get(nam).get(num));
                                        } else {
                                            System.out.println("Enter mark");
                                            mar = scanner.nextLine();
                                            categories.get(cat).get(nam).put(num, mar);
                                        }
                                    }else{break;}
                                }
                            }
                        }else{break;}
                    }
                }

            } else {
                System.out.println("Bye!");
                break;
            }

        }
    }
}

