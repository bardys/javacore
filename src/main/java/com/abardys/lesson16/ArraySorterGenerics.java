package com.abardys.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by anbar on 13-Jul-17.
 */
public class ArraySorterGenerics {

    private List myList;


    public ArraySorterGenerics(List<? extends Number> myList) {
        this.myList = myList;
        sort();
    }

    public void sort() {
        Collections.sort(myList);

    }

    public List getMyList(){
        return myList;
    }

    public static List sort(List<? extends Number> myList1){
        List l1 = myList1;
        Collections.sort(l1);
        return l1;
    }




}

