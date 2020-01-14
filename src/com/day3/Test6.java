package com.day3;

public class Test6 {

    public static void main(String[] args) {


        for (int i = 100; i <=999 ; i++) {
            //用integer.toString 把int 类型转化为字符串
            String s=Integer.toString(i);
//           //先用charAt取字符串每一个元素..在用String.valueof取值,而不是取ascll码.再用integer.parseint转化为int类型/
            int bai = Integer.parseInt(String.valueOf(s.charAt(0)));
            //parseInt是转换成基本类型.valueof是转换成对应的包装类型
            int shi = Integer.parseInt(String.valueOf(s.charAt(1)));
            int ge = Integer.parseInt(String.valueOf(s.charAt(2)));
            if((bai*bai*bai+shi*shi*shi+ge*ge*ge)==i){
                System.out.println(i);
            }
        }
    }
}
