package com.abardys.runners.homework;

import com.abardys.lesson12.homework.Human;
import com.abardys.lesson12.homework.WhiteCollar;

/**
 * Created by anbar on 21-Jun-17.
 */
public class Lesson12Runner {
    public static void lesson12Runner() {
        Human human = new Human(11, "John");

        System.out.println(human.getAge());
        System.out.println(human.getName());

        human.setAge(121);
        System.out.println(human.getAge());

        WhiteCollar whiteCollar = new WhiteCollar(55, "Bob","Google");
        System.out.println(whiteCollar.getCompany());
        whiteCollar.setCompany("Apple- ,");
        System.out.println(whiteCollar.getCompany());
    }

}
