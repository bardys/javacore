package com.abardys.runners.homework;

import com.abardys.lesson16.ArraySorterGenerics;
import com.abardys.lesson16.SortedWords;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anbar on 13-Jul-17.
 */
public class Lesson16Runner {
    public static void lesson16Runner() {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(8);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.4);
        doubleList.add(2.2);
        doubleList.add(7.1);

        System.out.println(ArraySorterGenerics.sort(intList));

        ArraySorterGenerics intArraySorterGenerics = new ArraySorterGenerics(intList);
        System.out.println(intArraySorterGenerics.getMyList());
        ArraySorterGenerics doubleArraySorterGenerics = new ArraySorterGenerics(doubleList);
        System.out.println(doubleArraySorterGenerics.getMyList());

        SortedWords.sortedWords();
    }
}
