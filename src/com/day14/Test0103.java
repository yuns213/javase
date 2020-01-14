package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test0103 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "没有哈哈1");
        map.put(2, "没有哈哈2");
        map.put(3, "没有哈哈3");
        map.put(4, "没有哈哈4");
        map.put(5, "没有哈哈5");
        map.put(6, "没有哈哈6");
        map.put(7, "没有哈哈7");
        map.put(8, "没有哈哈8");
        //获取的是键  类型是Integer
       Set<Integer> keys = map.keySet();

       Iterator<Integer> it = keys.iterator();

       while (it.hasNext()){
           Integer key = it.next();

           System.out.println(map.get(key)+" ,");
       }

        System.out.println("------------------------------------");

       for (Integer key :keys){
           System.out.println(map.get(key)+",");
       }

    }
}