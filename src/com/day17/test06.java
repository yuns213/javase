package com.day17;

import java.io.File;

public class test06 {
    public static void main(String[] args) {
        File file = new File("D://cs//aaa//b.txt");

        System.out.println("获取文件信息:"+file.getName()+" ,"+file.length()+"B ,"+file.getAbsolutePath()+" ,"+file.getParent());
    }
}
