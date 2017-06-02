package com.abardys.lesson12;

/**
 * Created by anbar on 01-Jun-17.
 */
public class Student {
    private String university;
    private String response =
            "Ehhh, what was the question?";

    public String getResponse() {
        return response;}

        public boolean setResponse(String response){
        if(response.length()>=3){
         this.response = response;
         return true;
        }
         else return false;

    }

}

