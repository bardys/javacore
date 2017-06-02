package com.abardys.lesson13;

/**
 * Created by anbar on 01-Jun-17.
 */
public class Teacher extends Person{
    private String lesson;
    private String question = "What?";

    public Teacher(String name, String lesson){
        super(name);
        this.lesson = lesson;

    }
    @Override
    public String eat(){}

    public final String teach(){
        return "Teach";
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("sd", "dsds");
        System.out.println(t.eat());
    }
}
