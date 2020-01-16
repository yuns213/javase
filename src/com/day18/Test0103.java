package com.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0103 {
    public static void main(String[] args) {
        String str = "i love java";

        File file =new File("D://cs//c.txt");
        FileOutputStream fos = null;
        byte[] b = str.getBytes();

        try {
            fos = new FileOutputStream(file,true);
            try {
                fos.write("\r\n".getBytes());
                fos.write(b);
                fos.write("\r\n".getBytes());
                fos.write(b);
                fos.write("\r\n".getBytes());
                fos.write(b);
                fos.write("\r\n".getBytes());
                fos.write(b);
                fos.write("\r\n".getBytes());
                fos.write(b);
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
