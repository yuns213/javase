package com.day2;

public class T5 {

    public static void main(String[] args) {


        printNum();
    }

    public static void printNum(){
        float f1= 12345.01f;
        float f2= 12345.00f;

        float var1 = f1>f2?12456:12456.02f;

        float var2 = var1+1024;
        System.out.println("var1的值为:"+var1+" var2的值为:"+var2);


    }
}
