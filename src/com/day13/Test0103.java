package com.day13;

import java.util.LinkedList;

public class Test0103 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("11");
        strings.add("13");
        strings.add("14");
        strings.add("15");
        strings.add("11");
        //linkedlist能够用list里的方法
        strings.add(4,"23");

        //用list的set 方法修改
        strings.set(3,"24");
        //用get方法获取指定元素
        System.out.println(strings.get(2));
        //用size获取大小
        System.out.println(strings.size());

        //用remove方法获取
        strings.remove(1);
        System.out.println(strings);

        strings.clear();
        System.out.println(strings);


    }
}
