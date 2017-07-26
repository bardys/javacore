package com.abardys.lesson16;

import java.util.*;

/**
 * Created by anbar on 14-Jul-17.
 */
public class SortedWords {
    public static SortedSet<String> stringSet = new TreeSet<>();
    public static List<String> stringList = new ArrayList<>();

    public static void addToStringSet(String word) {
        stringSet.add(word);
    }



    public static void sortedWords() {
                while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input words or press Enter for exit");
            String word = scanner.nextLine();
            if (!word.equals("")) {
                addToStringSet(word);
            } else {
                break;
            }
        }
        stringList.addAll(stringSet);


        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(i+1 + ". " + stringList.get(i));
        }

    }
}
