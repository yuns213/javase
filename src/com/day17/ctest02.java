package com.day17;

import javax.sound.sampled.Line;
import java.io.File;
import java.util.Scanner;

public class ctest02 {

    public static void main(String[] args) {

        String line = new Scanner(System.in).nextLine();
        File dir = new File(line);
        deleteFile(dir);
    }


    public static void deleteFile(File dir) {

        File[] subFiles = dir.listFiles();

        for (File subFile : subFiles) {

            if (subFile.isFile()) {
                subFile.delete();

            } else {
                deleteFile(subFile);
            }
        }

        dir.delete();
    }

}

