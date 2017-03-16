package com.abardys.app;

/**
 * Created by anbar on 02-Feb-17.
 */
public class NarrowingCasting {



    public float narrowing(float float1, double double1){
        float1 = (float)double1;
        System.out.println(float1);
        return float1;
    }
}
