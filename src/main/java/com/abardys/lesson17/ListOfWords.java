package com.abardys.lesson17;

import com.abardys.app.lesson4.Triangle;
import com.abardys.lesson14.Pixel;

import java.util.*;

/**
 * Created by anbar on 27-Jun-17.
 */
public class ListOfWords {


//    private List<Pixel> lineList = new ArrayList<>();
//
//    public void addToLineList(Pixel a) {
//        lineList.add(a);
//    }

    public static List<String> stringList = new ArrayList<>();

    public void addToStringList(String word) {
        stringList.add(word);
    }



    public static void main(String[] args) {
        ListOfWords listOfWords = new ListOfWords();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a word or --- for exit");
            String word = scanner.nextLine();
            if (!word.equals("---")) {
                listOfWords.addToStringList(word);
            } else {
                break;
            }
        }
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(i+1 + ". " + stringList.get(i));
        }

        for (String element : stringList) {
            if (stringList.indexOf(element) < stringList.size() - 1) {
                System.out.print(element + ", ");
            } else {
                System.out.print(element);
            }
        }
        System.out.println("");
        Set<String> stringSet = new HashSet<>(stringList);
        System.out.println(stringSet);

        Map<String, Collection<String>> m1 = new HashMap<>();
        m1.put("list", stringList);
        m1.put("set", stringSet);
        System.out.println(m1.keySet());

        List<String> l1 = (List<String>) m1.get("list");
        l1.add(0, "NEW!");
        m1.put("list", l1);
        System.out.println(m1);

    }
}





