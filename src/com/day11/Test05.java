package com.day11;

import java.util.Calendar;


public class Test05 {

    public static void main(String[] args) {
        //获取当前时间
        Calendar calendar = Calendar.getInstance();


        //调用日期对象的add方法,让当前理你往后移动500天
        calendar.add(Calendar.DAY_OF_MONTH ,500);


        //输出500天后的时间
        System.out.println(calendar.get(Calendar.YEAR)+"年"+calendar.get(Calendar.MONTH)+1+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日");



    }
}
