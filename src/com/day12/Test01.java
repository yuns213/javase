package com.day12;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {

    public static void main(String[] args) {
        //创建Collectin对象
        Collection c = new ArrayList();
        //添加各种元素
        c.add("不知火");
        c.add("茨木童子");
        c.add("酒吞童子");
        c.add("塞恩");
        c.add("塞纳");
        //删除下标为4的元素
        c.remove(4);
        //打印集合的大小用size()方法
        System.out.println("集合大小:"+c.size());

        //用clean清空集合,变成一个空集合
        c.clear();
        //输出集合内容
        System.out.println(c);
    }
}
