package com.day7;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {


        String str1 = new String();
        System.out.println("str1" + str1);

        String str2 = new String("abc");
        System.out.println(str2);

        char[] chs = {'A', 'B', 'C', 'D', 'E'};
        String str3 = new String(chs);
        System.out.println(str3);
        //用byte创建String  会把里面的字节元素从ascll码转化成utf-8!
        byte[] bytes = {97, 98, 99, 100, 101};
        String str4 = new String(bytes);
        System.out.println(str4);

        System.out.println("--------------------------------------");
        int[] arr={24,546,7,5678,58,76,83,45,435,34};
        System.out.println(arr); //[I@1540e19d //将数组转换成字符串
        String str = Arrays.toString(arr); //[24, 546, 7, 5678, 58, 76, 83, 45, 435, 34]
        System.out.println(str);


    }
}
