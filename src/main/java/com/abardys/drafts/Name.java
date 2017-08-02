package com.abardys.drafts;

import java.util.Map;

/**
 * Created by anbar on 26-Jul-17.
 */
public class Name {
    private static String nameName;
    public static Map phones;

    public Name(String nameName, Map phones){
        this.nameName = nameName;
        this.phones = phones;
    }

    public static String getNameName(){return nameName;}
    public static Map getPhones(){return phones;}
    public void setNameName(String nameName){this.nameName = nameName;}

    public static void addPhoneNumber(String phoneMark, String phoneNumber){
        phones.put(phoneMark, phoneNumber);
        System.out.println("Phonenumber \"" + phoneNumber + "\" was added.");
    }
}
