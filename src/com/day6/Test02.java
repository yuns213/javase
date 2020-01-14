package com.day6;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数据:");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数据:");
        int c = scanner.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        System.out.println("三个数的最大值:" + max);

    }
}
