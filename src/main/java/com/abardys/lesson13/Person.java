package com.abardys.lesson13;

/**
 * Created by anbar on 01-Jun-17.
 */
public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public final String eat() {
        return "Food";
    }

    public String getResponse(String question) {
        return "My answer is " + question;
    }

}
