package com.day17;

import java.io.File;
import java.io.FileFilter;

public class stest04 {
    public static void main(String[] args) {
        File file = new File("D://cs");

        f(file);

    }

    public static  void f(File file){
        File[] files = file.listFiles(n->{
                return  n.getName().endsWith(".java");

            });
        for (File f1 :files){
            System.out.println(f1.getName());
        }
    }
}
