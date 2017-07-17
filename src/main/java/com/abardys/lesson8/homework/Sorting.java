package com.abardys.lesson8.homework;

/**
 * Created by anbar on 17-Jul-17.
 */
public class Sorting {
    public int[] ascending(int[] myArrayAsc) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < myArrayAsc.length - 1; i++) {
                if (myArrayAsc[i] > myArrayAsc[i + 1]) {
                    int b = myArrayAsc[i];
                    myArrayAsc[i] = myArrayAsc[i + 1];
                    myArrayAsc[i + 1] = b;
                    flag = true;
                }
            }
        }
        return myArrayAsc;
    }

    public int[] descending(int[] myArrayDes) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < myArrayDes.length - 1; i++) {
                if (myArrayDes[i] < myArrayDes[i + 1]) {
                    int b = myArrayDes[i];
                    myArrayDes[i] = myArrayDes[i + 1];
                    myArrayDes[i + 1] = b;
                    flag = true;
                }
            }
        }
        return myArrayDes;
    }
}
