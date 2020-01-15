package com.day17;

import java.io.File;
import java.util.Scanner;

public class stest05 {
    public static void main(String[] args) {
        String s  = new  Scanner(System.in).nextLine();

        File f = new File(s);

        File[] files = f.listFiles();

        for (File f1 :files){
            f1.delete();
        }
        f.delete();
    }

}
