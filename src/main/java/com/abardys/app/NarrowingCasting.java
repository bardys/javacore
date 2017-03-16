package com.abardys.app;

/**
 * Created by anbar on 02-Feb-17.
 */
public class NarrowingCasting {
    float float1 = 0.0f;
    double double1 = 3.14159d;


    public void narrowing(){
        float1 = (float)double1;
        System.out.println(float1);
    }
}
