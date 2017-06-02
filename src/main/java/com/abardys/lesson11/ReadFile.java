package com.abardys.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by anbar on 18-May-17.
 */
public class ReadFile {
    public static void main(String[] args) {
         BufferedReader br = null; FileReader fr = null; String sCurrentLine;

        try {

            fr = new FileReader("D:/input.tx"); br = new BufferedReader(fr);

            br = new BufferedReader(new FileReader("D:/input.tx"));

            while ((sCurrentLine = br.readLine()) != null) {

                System.out.println(sCurrentLine);

            }

        } catch (FileNotFoundException e) {

            System.out.println("Your file is not found " + e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null) { br.close(); }

                if (fr != null) { fr.close(); }

            } catch (IOException ex) {

                ex.printStackTrace();

            } }
    }
}
