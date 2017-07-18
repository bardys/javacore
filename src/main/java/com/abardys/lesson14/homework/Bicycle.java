package com.abardys.lesson14.homework;

/**
 * Created by anbar on 16-Jun-17.
 */
public abstract class Bicycle {
    public void ride(){
        System.out.println("Wroom");
    }
    public abstract void setSpeed(int s);
    public abstract void setGear(int g);
}
