package com.day17;

import java.io.File;
import java.io.IOException;

public class lianxi {

    public static void main(String[] args) throws IOException {
        File file =new File("D://a");
        File file1 =new File("D://a//2.txt");
        File file2 =new File("D://b");
        File file3 =new File("D://c//v//a");

        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());

        //判断该file表示的文件或者目录是否存在  
        System.out.println(file.exists());
        //表示是否是目录
        System.out.println(file.isDirectory());
        //表示是否是文件
        System.out.println(file.isFile());
        //当且仅当具有该名称的文件不存在的时候,创建一个新的空文件
        System.out.println(file1.createNewFile());
        //创建一个子目录
        System.out.println(file2.mkdir());
        //创建多个子目录
        System.out.println(file3.mkdirs());

        //删除该file表示的文件或者目录
//        System.out.println(file.delete());

        //遍历 先获取字符串类型再遍历  返回的是字符串数组类型
        String[] list =  file.list();
        for (String name : list){
            System.out.println(name);
        }

        //遍历 获取file的数组.同上
        File[]  f = file.listFiles();
        for (File fi : f){
            System.out.println(fi);
        }



    }

}
