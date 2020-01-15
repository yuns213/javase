package com.day17;

import java.io.File;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) throws IOException {
        //一个参数创建file文件对象--绝对路径
        File file = new File("D://cs//1.txt");
        //没有这个文件则创建这个文件
        file.createNewFile();


        //两个参数创建--相对路径,默认是项目这个参照物..所以../往上一级是项目外
        String parnet = "../";
        String child = "2.txt";
        File f2 = new File(parnet,child);
        f2.createNewFile();
    }
}
