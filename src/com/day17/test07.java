package com.day17;

import java.io.File;

public class test07 {
    public static void main(String[] args) {

        File f = new File("D://cs//a.txt");
        File f2 = new File("D://cs//aaa");

        if (f.isFile()){
            System.out.println(f.getName()+"是一个文件");
        }else{
            System.out.println(f.getName()+"不是一个文件");
        }

        if (f2.isDirectory()){
            System.out.println(f.getName()+"是一个文件夹");
        }else{
            System.out.println(f.getName()+"不是一个文件夹");
        }
    }
}
