package com.abardys.runners.homework;

import com.abardys.lesson8.homework.ArrayPrint;
import com.abardys.lesson8.homework.Sorting;

/**
 * Created by anbar on 17-Jul-17.
 */
public class Lesson8Runner {


    public static void lesson8Runner() {

        int[] a = {2,1,3};

        Sorting sorting = new Sorting();
        ArrayPrint arrayPrint = new ArrayPrint();

        arrayPrint.print(a);
        arrayPrint.print(sorting.ascending(a));
        arrayPrint.print(sorting.descending(a));



    }
}
