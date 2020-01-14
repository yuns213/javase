package com.day6;


import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();   要输入int类型
//        double d = scanner.nextDouble(); 要输入 doble类型
//        boolean b = scanner.nextBoolean(); 输入boolean类型
//        String str = scanner.next();   输入字符串类型
//        String line  =scanner.nextLine();  输入


        System.out.println("请输入第一个数:");
        int a  =scanner.nextInt();
        System.out.println("请输入第一个数:");
        int b  =scanner.nextInt();
        System.out.println("请输入第一个数:");
        int c  =scanner.nextInt();
        double d = -5.5;



        System.out.println("三个数之和是:"+(a+b+c));




    }

}
