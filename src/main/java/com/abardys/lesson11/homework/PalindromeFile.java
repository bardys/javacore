package com.abardys.lesson11.homework;

import java.io.*;

/**
 * Created by anbar on 24-Jul-17.
 */
public class PalindromeFile {
    public static void palindromeFile() {
        BufferedReader br = null;
        FileReader fr = null;
        String sCurrentLine;
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("D:/input.txt");
            br = new BufferedReader(fr);
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);

                String sCurrentLineLower = sCurrentLine.toLowerCase();

                StringBuilder palindrome = new StringBuilder(sCurrentLineLower);
                palindrome.reverse();

                if (sCurrentLineLower.equals(palindrome.toString())) {
                    File file = new File("D:/output.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    fw = new FileWriter(file.getAbsoluteFile(), true);
                    bw = new BufferedWriter(fw);
                    bw.write(sCurrentLine + " is palindrome");
                    bw.newLine();
                    bw.close();

                } else {
                    File file = new File("D:/output.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    fw = new FileWriter(file.getAbsoluteFile(), true);
                    bw = new BufferedWriter(fw);
                    bw.write(sCurrentLine + " is not palindrome");
                    bw.newLine();
                    bw.close();
                }
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
