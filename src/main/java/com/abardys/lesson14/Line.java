package com.abardys.lesson14;

/**
 * Created by anbar on 06-Jun-17.
 */
public class Line {
    private Pixel[] line = new Pixel[2];
    public Line (Pixel a, Pixel b){
        line[0] = a;
        line[1] = b;
    }
    public void addPixel(Pixel pixel){
        Pixel[] newLine = new Pixel[line.length+1];
        for(int i = 0; i<line.length; i++){
            newLine[i] = line[i];
        }
        newLine[newLine.length-1] = pixel;
        line = newLine;
    }
}
