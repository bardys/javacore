package com.abardys.lesson17.homework;

import java.util.*;

import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;

/**
 * Created by anbar on 25-Jul-17.
 */
public class Phonebook {
    public static List categories = new ArrayList();

    public static void addCategory(String categoryName){
        List namesList = new ArrayList();
        Category category = new Category(categoryName, namesList);
        categories.add(category);
        System.out.println("Category \"" + category.getCategoryName() + "\" was added.");
    }


}
