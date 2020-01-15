package com.day17;

import java.io.File;
import java.util.Scanner;

public class stest06 {
    public static void main(String[] args) {

        String s = new Scanner(System.in).nextLine();

        File file = new File(s);
        System.out.println(f(file));
    }

    public static  long f(File file){
        File[] f1 = file.listFiles();
        long size  = 0;
        for(File file1 : f1){
            if(file1.isFile()){
                long l = file1.length();
                size +=l;
            }else{
                f(file1);
            }
        }
           return size;
    }

}
