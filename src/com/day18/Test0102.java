package com.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0102 {
    public static void main(String[] args) {
        String str = "asdqqweq";
        File file =new File("D://cs//b.txt");

        FileOutputStream fos = null;
        try {
            //这个是输出字节流的方法
            fos = new FileOutputStream(file);
            //这是通过数组的方式写出元素
            byte[] b = str.getBytes();
            try {
                //这个是用输出流的write方法加进去
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
