package com.day17;

import java.io.File;
import java.util.Scanner;

public class stest02 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        File file = new File(str);

        if (file.isFile()){
            System.out.println("文件"+file.length());
        }else{
            File[] files = file.listFiles();
                double sum = 0;
            for (File file1 :files){
                double d=file1.length();

                sum += d;

            }
            System.out.println(sum);
        }

    }

}
