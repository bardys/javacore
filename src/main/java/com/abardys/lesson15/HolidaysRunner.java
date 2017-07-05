package com.abardys.lesson15;

/**
 * Created by anbar on 03-Jul-17.
 */
public class HolidaysRunner {
    public static void main(String[] args) {
        for (Holidays value : Holidays.values()) {
            System.out.println(value.getName() + " holiday is on " + value.getMonth() + ", " + value.getDay());
        }
    }
}
