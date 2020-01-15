package com.day17;

import java.io.File;

public class test09 {
    public static void main(String[] args) {

        int num = 101;
        int sum = printDir(num);

        System.out.println(sum);

    }

    public static int printDir(int num){
        if (num == 1){
            return 1;
        }
        return num +printDir(num-1);
    }
}
