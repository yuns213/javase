package com.day19;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        String str = "i love java";
        BufferedOutputStream bos = null;

        try {
            bos = new BufferedOutputStream(new FileOutputStream("D://cs//e.txt"));
            byte[] b = str.getBytes();

            bos.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally{
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
