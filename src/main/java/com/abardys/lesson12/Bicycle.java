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
        this.color = color;
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

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.wheelSize);
        System.out.println(bicycle.color);
        System.out.println(bicycle.amountOfGears);
        System.out.println(bicycle.breakType);

        Bicycle bicycle2 = new Bicycle(1, "blue", 2, "complex");
        System.out.println(bicycle2.wheelSize);
        System.out.println(bicycle2.color);
        System.out.println(bicycle2.amountOfGears);
        System.out.println(bicycle2.breakType);

        Bicycle bicycle3 = new Bicycle("black");
        System.out.println(bicycle3.wheelSize);
        System.out.println(bicycle3.color);
        System.out.println(bicycle3.amountOfGears);
        System.out.println(bicycle3.breakType);

        Bicycle bicycle4 = new Bicycle("green", 100);
        System.out.println(bicycle4.wheelSize);
        System.out.println(bicycle4.color);
        System.out.println(bicycle4.amountOfGears);
        System.out.println(bicycle4.breakType);
    }
}
