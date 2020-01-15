package com.day17;

import java.io.File;
import java.util.Scanner;

public class ctest04 {


    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        File dir = new File(str);    //获取文件夹路径

        printLevel(dir, 0);
    }


    public static void printLevel(File dir, int lev) {

        File[] subFiles = dir.listFiles();

        for (File subFile : subFiles) {

            for (int i = 0; i <= lev; i++) {

                System.out.print("\t");
            }

            System.out.println(subFile);

            if (subFile.isDirectory()) {

                printLevel(subFile, lev + 1);

//
            }
        }
    }

}