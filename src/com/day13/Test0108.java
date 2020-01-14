package com.day13;

import org.omg.CORBA.SetOverrideType;

import java.util.Iterator;
import java.util.LinkedList;

public class Test0108 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();

        linkedList.add("王昭君");
        linkedList.add("王昭君");
        linkedList.add("西施");
        linkedList.add("杨玉环");
        linkedList.add("貂蝉");


        Iterator<String> it = linkedList.iterator();
        //用迭代器获取元素
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
        }
        //用增强for获取元素

        for (String u : linkedList){
            System.out.print(u+" ");
        }

    }
}
