package com.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test08 {

    public static void main(String[] args) throws ParseException {
        //日期字符串
        String str = "2016-12-18";
        //定义 - - 的日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //将日期字符串转换成 - - 的日期格式
        Date day = df.parse(str);
        //再通过applyPattern方法转换成 年 月 日 格式
        df.applyPattern("yyyy年MM月dd日");
        //再用format输出日期格式

        System.out.println(df.format(day));

    }
}
