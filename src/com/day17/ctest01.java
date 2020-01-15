package com.day17;

import java.io.File;
import java.io.FileFilter;

public class ctest01 {

    public static void main(String[] args) {

        File dir = new File("D://cs");
        if(!dir.exists()) {
            throw new RuntimeException("该文件夹不存在");
        }
        get(dir, 0);
    }

    private static void get(File dir, int length) {
        if(!dir.exists()) {
            throw new RuntimeException("该文件夹不无访问权限");
        }
        for (int i = 0; i < length; i++)
            System.out.print("    ");
        System.out.println(dir);
        File[] files = dir.listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return true;
                if (pathname.isHidden())
                    return false;

                if (pathname.length() / 1024 < 200)
                    return true;
                return false;
            }

        });

        for (File file : files) {
            if (file.isDirectory()) {
                get(file, length + 1);
            } else {
                for (int i = 0; i < length; i++)
                    System.out.print("  ");
                System.out.println("  " + file);
            }
        }
    }
}
