package com.day7;

public class Test08 {

    public static void main(String[] args) {

        String str = "javajfiewjavajfiowfjavagkljjava";
        String ch ="java";

        System.out.println(str+"字符串中的java的数量:"+getCount(str, ch));

    }


    public static int getCount(String str,String ch) {
        //定义count得知有多少个java在字符串里
        int count = 0;
        //最开始的str.indexOf(ch)是不会等于-1的!=-1
        while (str.indexOf(ch)!=-1){
            int i = str.indexOf(ch);

            str = str.substring(i+4);

            count++;

        }return count;
    }
}
