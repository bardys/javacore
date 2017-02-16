package com.abardys.app;

/**
 * Created by anbar on 31-Jan-17.
 */
public class WideningCasting {
    byte byte1=127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;
    double double1 = 0.0d;

    public void widening(){
        double1=float1=long1=int1=short1=byte1;
        System.out.println(double1);
    }

}
