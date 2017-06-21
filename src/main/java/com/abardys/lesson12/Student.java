package com.abardys.lesson12;

/**
 * Created by anbar on 01-Jun-17.
 */
public class Student {
    private String university;
    private String response =
            "Ehhh, what was the question?";

    public String getResponse() {
        return response;
    }

    public boolean setResponse(String response) {
        if (response.length() >= 3) {
            this.response = response;
            return true;
        } else {return false;}
    }

    public String getUniversity() {
        return university;
    }

    public boolean setUniversity(String university) {
        if (university.length() >= 2) {
            this.university = university;
            return true;
        } else {return false;}
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getResponse());
        System.out.println(student.getUniversity());
        System.out.println(student.setResponse("changedResponse"));
        System.out.println(student.setUniversity("changedUniversity"));
        System.out.println(student.getResponse());
        System.out.println(student.getUniversity());
    }
}

