package com.abardys.lesson11.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anbar on 24-Jul-17.
 */
public class NumbersReadFile {
    public static BufferedReader br = null;
    public static FileReader fr = null;
    public static String sCurrentLine;

    public static List<double[]> readNumbers() {
        List<double[]> doubleList = new ArrayList<>();
        double[] doubleArray;
        try {
            fr = new FileReader("D:/inputNumbers.txt");
            br = new BufferedReader(fr);
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);

                String[] splitedStringArray = sCurrentLine.split(",");
                doubleArray = new double[splitedStringArray.length];
                for (int i = 0; i < splitedStringArray.length; i++) {
                    String s = splitedStringArray[i];
                    double d = Double.valueOf(s);
                    doubleArray[i] = d;
                }
                Arrays.sort(doubleArray);
                doubleList.add(doubleArray);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Your file is not found " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return doubleList;
    }

}
