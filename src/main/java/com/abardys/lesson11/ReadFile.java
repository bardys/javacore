package com.abardys.lesson11;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by anbar on 18-May-17.
 */
public class ReadFile {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(

                new FileReader("D:\\input.txt"));

        String line;

        while ((line = reader.readLine()) != null) {

            System.out.println(line);

        }

        reader.close();
    }
}
