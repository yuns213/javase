package com.day13;

import java.util.LinkedList;

public class Test0104 {
    public static void main(String[] args) {
        LinkedList linkedList  = new LinkedList();

        linkedList.add("232");
        linkedList.add("212");
        linkedList.add("252");
        linkedList.add("222");
        //在集合的最前面加一个元素
        linkedList.addFirst("232");
        //在集合的最后面加一个元素
        linkedList.addLast("2343");
        //获取第一个元素
        System.out.println(linkedList.getFirst());
        //获取集合最后一个元素
        System.out.println(linkedList.getLast());
        //removerfirst 删除第一个元素
        //removerlast删除最后一个元素
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);


    }
}
