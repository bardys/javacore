package com.abardys.app.finalProject;

/**
 * Created by anbar on 08-Aug-17.
 */
public enum QualificationWithCourse {
    STUDENT1("1"),
    STUDENT2("2"),
    STUDENT3("3"),
    STUDENT4("4"),
    BAKALAVR5("5"),
    BAKALAVR6("6");

    private String course;

    QualificationWithCourse(String course){
        this.course = course;
    }

    public String getCourse(){return course;}
}
