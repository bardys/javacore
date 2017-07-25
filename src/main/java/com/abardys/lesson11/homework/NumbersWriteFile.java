package com.abardys.lesson11.homework;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anbar on 24-Jul-17.
 */
public class NumbersWriteFile {
    public static BufferedWriter bw = null;
    public static FileWriter fw = null;

    public static void writeNumbers(List<double[]> ls) {
        try {
            for (double[] arr : ls) {
                File file = new File("D:/outputNumbers.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }

                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                for(double element : arr){
                    bw.write(element + ", ");
                }

                bw.newLine();
                bw.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Your file is not found " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
