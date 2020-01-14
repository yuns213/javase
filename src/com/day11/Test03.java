package com.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {

    public static void main(String[] args) {
        //获取当前时间
        Date now = new Date();
        //利用SimpleDateFormat 制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将得到的now当前时间铜鼓指定的日期格式的Date对象通过format转化成字符串格式
        System.out.println(df.format(now));

    }


}

