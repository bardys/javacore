package com.abardys.lesson15;

/**
 * Created by anbar on 03-Jul-17.
 */
public enum Holidays {
    NEW_YEAR(1, "January", "New Year"),
    CHRISTMAS(7, "January", "Christmas"),
    CONSTITUTION_DAY(28, "June", "Constitution day");

    private int day;
    private String month;
    private String name;

    private Holidays(int day, String month, String name){
    this.day = day;
    this.month = month;
    this.name = name;
    }

    public int getDay(){return day;}
    public String getMonth(){return month;}
    public String getName(){return name;}
}
