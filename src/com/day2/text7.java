package com.day2;

public class text7 {
    public static void main(String[] args) {

        op3(8356);
    }

    public static void op3(int num){
        //4567  获取千位，百位,十位,个位
        int  a = num/1000;
        int  b  = num/100%10;
        int c = num/10%10;
        int  e= num%10;
        System.out.println("千"+a+"百"+b+"十"+c+"个"+e);
    }
}
