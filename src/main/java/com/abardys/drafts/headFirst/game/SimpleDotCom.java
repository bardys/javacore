package com.abardys.drafts.headFirst.game;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "Потопил";
                System.out.println("Ой! Вы потоили " + name + " :(");
            }else {
                result = "Попал";
            }
        }
        return result;
    }
}
