package com.day18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test0301 {
    public static void main(String[] args) {
        System.out.println("请输入要复制 .java文件 的文件夹路径：");
        String path = new Scanner(System.in).nextLine();

        getJavaFile(path);
    }

    //复制文件函数
    public static void copyFile(File file) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file.getPath());
            fw = new FileWriter("D://cs//" + file.getName());

            char[] ch = new char[1024];

            int len = 0;

            while ((len = fr.read(ch)) != -1) {

                fw.write(ch, 0, len);

            }
        } catch (IOException e) {


        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException e) {

                }
            }
        }
    }


    public static void getJavaFile(String path) {
        File file = new File(path);
        File[] files = file.listFiles(new MyFilter());
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                getJavaFile(files[i].getPath());
            } else {
                copyFile(files[i]);
            }
        }
    }



}
