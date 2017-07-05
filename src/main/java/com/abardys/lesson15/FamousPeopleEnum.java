package com.abardys.lesson15;

/**
 * Created by anbar on 04-Jul-17.
 */
public enum FamousPeopleEnum {
    KURT_COBAIN(43, "NO"),
    BARAK_OBAMA(45, "YES"),
    VIKTOR_YANUKOVYCH(60, "YES"),
    TARAS_SHEVCHENKO(200, "NO"),
    ILON_MASK(50, "YES");

    private int age;
    private String lifeStatus;

    private FamousPeopleEnum(int age, String lifeStatus){
        this.age = age;
        this.lifeStatus = lifeStatus;
    }

    public int getAge(){return age;}
    public String getLifeStatus(){return lifeStatus;}
}
