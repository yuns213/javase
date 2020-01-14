package com.day7;

public class Test01 {
    public static void main(String[] args) {
        //方法一 用字符串创建
        String str1 = new String("你好");
        System.out.println("方式一创建字符串: "+str1);

        //方法二 用char转字符串创建
        char[]  chars = {'h','e','l','l','o'};
        String str2 = new String(chars);
        System.out.println("方式二创建字符串:"+str2);

        //方法三 用byte数组转字符串创建
        byte[] bytes = {97,98,99,100,101};
        String str3 = new String(bytes);
        System.out.println("方式三创建字符串:"+str3);
    }



}
