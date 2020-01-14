package com.day7;

public class Test03 {

    public static void main(String[] args) {

        String str = "HelloWorld广州";


        System.out.println("str字符串的长度: "+str.length());

        System.out.println("str字符串的索引为2的char值: "+str.charAt(2));

        System.out.println("字符串o第一次出现在str字符串中的索引:"+str.indexOf("o"));

        System.out.println("截取字符串str从索引6开始到结束:"+str.substring(6));

        System.out.println("截取字符串str从索引2开始到索引7:"+str.substring(2,7));
    }
}
