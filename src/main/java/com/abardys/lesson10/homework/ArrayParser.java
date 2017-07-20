package com.abardys.lesson10.homework;



import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/**
 * Created by anbar on 19-Jul-17.
 */
public class ArrayParser {
    public static void arrayParser() {
        System.out.println("Enter numbers delimited by \";\":");

        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();

        String[] enterArray = enter.split(";");

        List enterList;
        enterList = Arrays.asList(enterArray);
        Collections.sort(enterList);

        System.out.println("Enter \"1\" for ascending sorting\nEnter \"2\" for descending sorting");
        int howToSort = scanner.nextInt();

        if(howToSort == 1) {
            for (Object element : enterList) {
                System.out.print(element);
            }
            System.out.println("");
        }else if(howToSort == 2){
            Collections.reverse(enterList);
            for (Object element : enterList) {
                System.out.print(element);

            }
            System.out.println("");
        }else{
            System.out.println("Wrong enter\n");
        }
    }
}
