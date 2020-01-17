package com.day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        PrintStream p = null;

        try {
            p = new PrintStream("D://cs//d.txt");
            //给输出print转向到p对象所指的文件d.txt中
            System.setOut(p);
            //现在输出就是在文件中了
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            p.close();
        }

    }
}
