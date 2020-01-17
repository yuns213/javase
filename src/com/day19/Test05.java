package com.day19;

import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        String s = "我爱java";
        OutputStreamWriter osw = null;

        try {
            osw = new OutputStreamWriter(new FileOutputStream("D://cs//a.txt"), "GBK");

            osw.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
