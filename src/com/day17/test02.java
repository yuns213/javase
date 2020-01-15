package com.day17;

import java.io.File;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) throws IOException {
        //创建文件对象
        File f = new File("D://cs//a.txt");
        //用if判断文件时候存在,当a.txt不存在,则创建.
        if (!f.isFile()){
            f.createNewFile();
        }




    }
}
