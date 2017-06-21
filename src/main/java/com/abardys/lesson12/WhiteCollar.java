package com.abardys.lesson12;

/**
 * Created by anbar on 21-Jun-17.
 */
public class WhiteCollar extends Human {
    private String companyName;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz- ,";

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        this.companyName = companyName;
    }

    public String getCompany(){
        return companyName;
    }

    public void setCompany(String string) {
        try {
            for (int i = 0; i < string.length(); i++) {
                char stringChar = string.charAt(i);
                for (int j = 0; j <= alphabet.length(); j++) {
                    if (stringChar == alphabet.charAt(j)) {
                        break;
                    }
                }
            }
            companyName = string;
            System.out.println("Company name was changed");
        } catch (Exception e){
            System.out.println("Company name is invalid");
        }
    }
}
