package com.day17;

import java.io.File;

public class stest03 {
    public static void main(String[] args) {
        File file = new File("D://cs");

        files(file);

    }

    public  static  void  files(File file){
        File[] file1 = file.listFiles();

        for (File file2 :       file1){
            if (file2.isFile()){
                System.out.println(file2.getName());
            }else{
                files(file2);
            }

        }

    }
}
