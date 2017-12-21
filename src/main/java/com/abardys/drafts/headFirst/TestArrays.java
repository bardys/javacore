package com.abardys.drafts.headFirst;

public class TestArrays {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[] index = new int[4];


        islands[0] = "Bermudy";
        islands[1] = "Fidji";
        islands[2] = "Azorian islands";
        islands[3] = "Kosumel";
         index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;
        while(y<4){
            ref = index[y];
            System.out.print("islands = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
