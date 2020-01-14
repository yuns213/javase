package com.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {

    public static void main(String[] args) throws ParseException {

        //利用SimpleDateFormat 制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //定制自己的生日
        String str = "1997-01-09";
        //将定义的字符串生日通过parse方法转换成Data对象
        Date Brithday = df.parse(str);
        //将得到的now当前时间铜鼓指定的日期格式的Date对象通过format转化成字符串格式
        System.out.println("格式:"+df.format(Brithday));

    }


}

