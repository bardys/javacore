package com.abardys.lesson17.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anbar on 26-Jul-17.
 */
public class Category {
    private static String categoryName;
    public static List names;

    public Category(String categoryName, List names) {
        this.categoryName = categoryName;
        this.names = names;
    }

    public static String getCategoryName() {return categoryName;}
    public List getNames() {return names;}
    public void setCategoryName(String categoryName){this.categoryName = categoryName;}

    public static void addName(String nameName) {
        Map phonesMap = new HashMap();
        Name name = new Name(nameName, phonesMap);
        names.add(name);
        System.out.println("Name \"" + name.getNameName() + "\" was added.");
    }
}
