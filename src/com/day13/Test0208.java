package com.day13;

import java.util.HashSet;
import java.util.Scanner;

public class Test0208 {
    public static void main(String[] args) {
        System.out.println("请输入数字:");
        //录入输入的值
        Scanner scanner = new Scanner(System.in);

        //利用set不能重复的特性
        HashSet<Integer> set = new HashSet<>();
        //用boolean去判断while时候继续循环
        boolean b = true;
        //如果是true 就继续循环
        while (b) {
            //用input去获取录入的数字
            int input = scanner.nextInt();
            //判断如果录入的数字是-1的话,就给b一个flase传递到while中,这个循环就会将结束
            if (input == -1) {
                b = false;
                //如果是大于0的数字就加入到集合中
            } else if (input > 0) {
                set.add(input);
            }


        }

        //再通过遍历得到每个元素进行求和
        int sum = 0;
        for (int i : set) {
            sum += i;
        }


        System.out.println(set);
        System.out.println("数字总和是:" + sum);
        System.out.println("平均数是:" + sum / set.size());
    }

}