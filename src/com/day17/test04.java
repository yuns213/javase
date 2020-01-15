package com.day17;

import java.io.File;

public class test04 {

    public static void main(String[] args) {
        File f = new File("D://cs//ccc//bbb//aaa");
        //这个是创建多个子文件夹目录.一般都是用这个
        f.mkdirs();
    }
}
