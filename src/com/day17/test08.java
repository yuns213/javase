package com.day17;

import java.io.File;

public class test08 {
    public static void main(String[] args) {

        File file = new File("D://cs");
        //用file数组去保存cs文件下的文件夹和文件
        File[] f = file.listFiles();
        //通过遍历去获取每个元素
        for (File file1 :f){
            System.out.println(file1.getName());
        }
    }
}
