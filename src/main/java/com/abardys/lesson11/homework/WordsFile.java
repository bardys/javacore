package com.abardys.lesson11.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anbar on 25-Jul-17.
 */
public class WordsFile {
    public static void wordsFile() {
        List<String> stringList = new ArrayList<>();
        String text = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename:");
        String filename = scanner.nextLine();

        while (true) {
            System.out.println("Enter text or \"exit\":");
            text = scanner.nextLine();
            if(!text.equals("exit")){
            stringList.add(text);
        }else{
                break;
            }
        }

        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
                File file = new File("D:/" + filename);
                if (!file.exists()) {
                    file.createNewFile();
                }

                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                for(String s : stringList){
                    bw.write(s);
                    bw.newLine();
                }


                bw.newLine();
                bw.close();
                System.out.println("Done!");


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
