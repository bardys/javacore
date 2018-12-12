package com.abardys.app.headFirstJava;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 *24;

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        for(int x = 0; x <60; x++) {
            day1 += (long) (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            System.out.println(String.format("Повняк був %tc", c));
        }
    }





}
