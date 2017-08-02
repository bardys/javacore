package com.abardys.drafts;

import java.util.*;

/**
 * Created by anbar on 25-Jul-17.
 */
public class PhonebookObjects {
    public static List categories = new ArrayList();

    public static void addCategory(String categoryName){
        List namesList = new ArrayList();
        Category category = new Category(categoryName, namesList);
        categories.add(category);
        System.out.println("Category \"" + category.getCategoryName() + "\" was added.");
    }


}
