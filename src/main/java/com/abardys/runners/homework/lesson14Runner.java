package com.abardys.runners.homework;

import com.abardys.lesson14.Bicycle;
import com.abardys.lesson14.BicycleWithRing;
import com.abardys.lesson14.BicycleWithRingInterface;
import com.abardys.lesson14.CustomBicycle;

/**
 * Created by anbar on 16-Jun-17.
 */
public class lesson14Runner {
    public static void main(String[] args) {
        Bicycle bicycle = new CustomBicycle();
        bicycle.setSpeed(35);
        bicycle.setGear(5);
        bicycle.ride();

        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();
    }
}
