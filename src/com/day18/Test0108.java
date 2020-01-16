package com.day18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test0108 {
    public static void main(String[] args) {


        FileWriter fw = null;
        try {
            fw = new FileWriter("D://cs//info.txt",true);
            while (true) {
                System.out.println("请输入内容:");
                String str = new Scanner(System.in).nextLine();

                if ("886".equals(str)){
                    break;
                }
                fw.write(str);
                fw.write("\r\n");
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
