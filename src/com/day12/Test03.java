package com.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {

    public static void main(String[] args) {
        //创建集合
        Collection<String> c = new ArrayList();

        c.add("轮子妈");
        c.add("奥拉夫");
        c.add("布隆");
        c.add("狼人");
        //创建迭代器
        Iterator<String> it = c.iterator();
        //用while死循环.当没有元素的时候hasNext会返回flase
        while (it.hasNext()){
            //用字符串取接收遍历的每一个元素
            String s=it.next();
            //打印
            System.out.println(s);
        }
    }
}
