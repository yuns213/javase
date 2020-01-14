package com.day7;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        //用while死循环保持程序运行
        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.println("请输入一个QQ号码:");
            //创建String对象接收用户输入的数据
            String qq = in.next();
            System.out.println("这个QQ号码是否正确:" + checkQQ(qq));
        }
    }

    public static Boolean checkQQ(String qq) {
        //判断qq的长度是否正确
        if (qq.length() <= 5 || qq.length() >= 12) {
            return false;
        }
        //判断开头时候是"0",是则返回flase
        if(qq.startsWith("0")==true){
            return  false;
        }

        //将qq字符串转换成char的数组
        char[] chars = qq.toCharArray();
        //遍历获取数组的每个元素
        for (int i = 0; i <chars.length ; i++) {
            //通过if判断每个元素是否是在'0'-'9'中.
            if (chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;

    }
}
