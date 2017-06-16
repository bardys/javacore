package com.abardys.lesson14;

/**
 * Created by anbar on 16-Jun-17.
 */
public class CustomBicycle extends Bicycle{
    int speed;
    int gear;

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }

    @Override
    public void setSpeed(int s){
        this.speed = s;
        System.out.println(speed);
    }

    @Override
    public void setGear(int g){
        this.gear = g;
        System.out.println(gear);
    }



}
