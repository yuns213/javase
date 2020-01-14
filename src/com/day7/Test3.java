package com.day7;

public class Test3 {


    public static void main(String[] args) {


        String str ="user(name='马化腾',age=65,money=250000000.0)";

        //先用substring去掉user（ 和  ）
        str =str.substring(5,str.length()-1);
        //再用replace去掉name里的  ‘ ，再赋值给str。
        str  = str.replace("'", "");
        //用新的字符串数组接收被split截取的三段字符串。
        String[]  str1 = str.split(",");
        //定义一个长度为3的空字符串数组来接收需要的数据
        String [] str3= new String[3];

        for (int i = 0; i < str1.length; i++) {
            //新建一个字符串数组通过遍历后的str1用split分割"="的两段字符串
            String[] str2 =  str1[i].split("=");
            //再用str3去接收str2每次遍历取其下标2的数据
            str3[i] = str2[1];


        }
        //再遍历展示所需的数据
        for (int i = 0; i < 3; i++) {
            System.out.println(str3[i]);
        }

    }

}
