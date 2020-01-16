package com.day18;

import java.io.*;

public class Test0202 {
    public static void main(String[] args) {
        //这个是di目录
        File file = new File("D://cs//d1");
        //这个d1文件夹下的文件数组
        File[] files = file.listFiles();
        //创建字节输出输入
        FileOutputStream fos = null;
        FileInputStream fis = null;
        //遍历文件数组,获得每个文件
        for (File f : files) {
            try {
                //这个是把每个文件的绝对路径获取出来
                String fisd = file + "//" + f.getName();
                //这个是把d1文件的内容输入到内存中
                fis = new FileInputStream(fisd);
                //这个是把存放在内存的文件和内容创建到d2的文件夹下
                fos = new FileOutputStream("D://cs//d2//" + f.getName());
                //这个是因为1kb等于1024b  数组定义在1024的意义
                byte[] b = new  byte[1024];
                //这个是用输入流获取b字节数组,输入流返回的是int类型,所以用a变量去接收
                int a = fis.read(b);
                //然后通过输出流去添加(byte[],偏移量0从头开始,a是'多少'的意思)
                fos.write(b,0,a);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fos.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
