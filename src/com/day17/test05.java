package com.day17;

import java.io.File;

public class test05 {
    public static void main(String[] args) {

        File f  = new File("D://cs//a.txt");
        File f2  = new File("D://cs//aaa");
        //删除目录和文件都是用这个方法
        f.delete();

        f2.delete();

    }
}
