package com.abardys.finalProject;

/**
 * Created by anbar on 08-Aug-17.
 */
public enum QualificationWithCourse {
    СТУДЕНТ1("1"),
    СТУДЕНТ2("2"),
    СТУДЕНТ3("3"),
    СТУДЕНТ4("4"),
    БАКАЛАВР5("5"),
    БАКАЛАВР6("6");

    private String course;

    QualificationWithCourse(String course){
        this.course = course;
    }

    public String getCourse(){return course;}
}
