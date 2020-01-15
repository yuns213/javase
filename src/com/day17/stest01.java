package com.day17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class stest01 {
    public static void main(String[] args) throws IOException {
        String str = new Scanner(System.in).nextLine();
        File file = new File("D://cs//1.txt");

        if (file.getName().equals(str)){
            System.out.println(file.length()+"B");
        }else{
            file.createNewFile();
            System.out.println("创建了");
        }


    }
}
