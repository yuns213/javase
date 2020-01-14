package com.day7;

public class Test04 {

    public static void main(String[] args) {


        String str = "HelloWorld";
        //toCharArray是转换为char的方法
        char[] chars= str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }
        //转化小写的toLowerCase方法
        System.out.println("将字符串转换为小写:"+str.toLowerCase());
        //转化大写的toUpperCase方法
        System.out.println("将字符串转换为大写:"+str.toUpperCase());
        String str1 = str.replace('o', '6');
        String str2 = str.replace("ll", "LL");
        System.out.println("将字符串中的字符'o'替换成'6':"+str1);
        System.out.println("将字符串中的字符ll替换成LL:"+str2);
    }

}
