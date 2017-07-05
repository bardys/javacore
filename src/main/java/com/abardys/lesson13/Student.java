package com.abardys.lesson13;

/**
 * Created by anbar on 01-Jun-17.
 */
public class Student extends Person {
    private String university;
    private String response = "Ehhh, what was the question?";

    public Student(String name, String university) { // constructor
        super(name); // call parent (super) class constructor
        this.university = university; // extend with new properties

    }


    public String getResponse() { // method
        return response;

    }



//    public void setName() {
//        this.name = name;
//    }

    @Override
    public String getResponse(String question) {
        return "Ehhh, what was the question?";

    }

    public static void main(String[] args) {
        Student student = new Student("Bill", "Chicago");
        System.out.println(student.getName());
    }
}
