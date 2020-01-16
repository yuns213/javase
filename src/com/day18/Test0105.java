package com.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test0105 {
    public static void main(String[] args) {
        File file = new File("D://cs//b.txt");
        //这是存放byte数组的两个元素
        byte[] b = new byte[2];
        //定义一个a来接收读取的fis.read()返回的int类型
        int a;

        try {
            //这个是输入流
            FileInputStream fis = new FileInputStream(file);
            try {
                //死循环判断a是否是-1,read(b)表示一下读取两个字节
                while ((a = fis.read(b)) != -1) {
                    //这个就是打印输出字节.a表示的是如果最后只剩一个的时候只打印一个
                    System.out.println(new String(b, 0, a));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
