package com.abardys.runners.homework;

import com.abardys.lesson14.homework.Bicycle;
import com.abardys.lesson14.homework.BicycleWithRing;
import com.abardys.lesson14.homework.BicycleWithRingInterface;
import com.abardys.lesson14.homework.CustomBicycle;

/**
 * Created by anbar on 16-Jun-17.
 */
public class Lesson14Runner {
    public static void lesson14Runner() {
        Bicycle bicycle = new CustomBicycle();
        bicycle.setSpeed(35);
        bicycle.setGear(5);
        bicycle.ride();

        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();
    }
}
