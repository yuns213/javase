package com.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {

        String str = "[User{name=马云, age=56, money=2500.0}, User{name=马化腾, age=56, money=2400.0}, User{name=马赛克, age=56, money=2500.0}]";
        //先得到除[User 和  ]的字符串
        str = str.substring(6,str.length()-3);
        //用split把 }, User\{  给清除后的每段字符串用新字符串数组接收
        String[] str1 = str.split("}, User\\{");
        //先定义一个长度为3的字符串数组保存想要的数据
        String[] str5 = new String[3];

        for (int i = 0; i <str1.length ; i++) {
            //获取想要的数据之后的第一个下标.
            int j = str1[i].indexOf(",");
            //通过substring将要的数据的截取下来
            String str2 = str1[i].substring(5,j);
            //然后用str5获取遍历后的str2的值
            str5[i] = str2;
//            System.out.println(str5[i]);
        }

        //用静态方法Arrays.toString把字符串数组用字符串的方式展示出来
        System.out.println(Arrays.toString(str5));
    }
}
