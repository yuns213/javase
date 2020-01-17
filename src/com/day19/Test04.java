package com.day19;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入验证码:");
            String in = new Scanner(System.in).nextLine();
            if ("88".equals(in)) {
                System.out.println("你已经退出验证!");
                break;
            }

            str(in);
        }

    }

    public static void str(String s) {
        HashSet<String> set = new HashSet<>();

        BufferedReader bw = null;
        String line = null;
        try {
            bw = new BufferedReader(new FileReader("D://cs//data.txt"));
            while ((line = bw.readLine()) != null) {
                set.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        for(String s1 :set){
            if(s1.equals(s)){
                System.out.println("验证成功!");
                return;
            }
        }
            System.out.println("验证失败!");
    }
}
