package com.day18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test0201 {
    public static void main(String[] args) {


        FileOutputStream fw = null;
        try {
            fw = new FileOutputStream("D://cs//stu.txt",true);
            while (true) {
                System.out.println("请输入内容:");
                String str = new Scanner(System.in).nextLine();

                byte[] b = str.getBytes();

                if ("end".equals(str)){
                    break;
                }
                fw.write(b);
                fw.write("\r\n".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
