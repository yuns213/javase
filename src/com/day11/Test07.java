package com.day11;

public class Test07 {


    public static void main(String[] args) {

        String str = "你猜我要加载多久~";
        StringBuffer str1 = new StringBuffer("你猜我要加载多久~");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i;
        }

        long end = System.currentTimeMillis();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1.append(i);
        }

        long end1 = System.currentTimeMillis();


        System.out.println("共耗时毫秒: " + (end - start));
        System.out.println("共耗时毫秒: " + (end1 - start1));

    }

}
