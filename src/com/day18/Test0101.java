package com.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0101 {
    public static void main(String[] args) {
        File file = new File("D://cs//a.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            try {
                fos.write(97);
                fos.write(98);
                fos.write(99);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
