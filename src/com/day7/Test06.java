package com.day7;

import java.util.Scanner;

public class Test06 {

    public static void main(String[] args) {

        String mgc = "奥巴马";
        Scanner in  = new Scanner(System.in);
        System.out.println("请输入一个字符串:");

        String input= in.next();

        String newInput = input.replace(mgc,"*");

        System.out.println(newInput);
    }
}
