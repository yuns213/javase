package com.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test06 {

    public static void main(String[] args) throws ParseException {
        //生日字符串
        String str = "1997.01.09";
        //日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat df1 = new SimpleDateFormat("dd");
        //生日字符串转化成日期格式
        Date birthday = df.parse(str);
        //获取当前系统时间
        Date date =new Date();

        long day = date.getTime() -birthday.getTime();

        System.out.println("恭喜活了:"+day/1000/60/60/24+"天");


    }
}
