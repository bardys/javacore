package com.abardys.lesson11;

import java.io.File;

/**
 * Created by anbar on 24-Jul-17.
 */
public class FilePath {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String linuxStyle = "dir/somefile.txt";
        String windowsStyle = "dir\\somefile.txt";

        File file = new File(currentDir, linuxStyle);
        System.out.println(file.getAbsolutePath());

        file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());
    }
}
