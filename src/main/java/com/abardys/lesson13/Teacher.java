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
    public final String teach(){
        return "Teach";
    }

    public String lessonFinished(){
        return "Do not forget to make homework!";
    }


    public static void main(String[] args) {
        Teacher t = new Teacher("sd", "dsds");
        System.out.println(t.eat());
        System.out.println(t.teach());
    }


}
