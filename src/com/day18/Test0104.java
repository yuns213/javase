package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test0104 {
    public static void main(String[] args) {
        File file = new File("D://cs//a.txt");


        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int a;
            try {

                while ((a = fis.read())!=-1) {

                    System.out.println((char)a);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}





