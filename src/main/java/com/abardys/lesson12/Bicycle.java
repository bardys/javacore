package com.abardys.lesson12;

/**
 * Created by anbar on 30-May-17.
 */
public class Bicycle {
    private int wheelSize;
    private String color;
    private int amountOfGears;
    private String breakType;

    public Bicycle(int wheelSize, String color, int amountOfGears, String breakType) {

        this.color = color;
        this.wheelSize = wheelSize;
        this.amountOfGears = amountOfGears;
        this.breakType = breakType;
    }

    public Bicycle(String color) {

        this();
        this.wheelSize = wheelSize;
    }

    public Bicycle() { // no-args constructor

        this.wheelSize = 26;
        this.color = "red";
        this.amountOfGears = 5;
        this.breakType = "simple";
    }

    public Bicycle(String color, int wheelSize){
        this(color);
        this.wheelSize = wheelSize;
    }

    public String ride() { // method

        return "Wroom!";

    }
}
