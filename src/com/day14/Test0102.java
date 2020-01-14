package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test0102 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "没有1");
        map.put(2, "没有2");
        map.put(3, "没有3");
        map.put(4, "没有4");
        map.put(5, "没有5");
        map.put(6, "没有6");
        map.put(7, "没有7");
        map.put(8, "没有8");
        //获取的是键  类型是Integer
        Set<Integer> keys = map.keySet();

        Iterator<Integer> it =  keys.iterator();

        while (it.hasNext()){
            Integer key = it.next();
            System.out.println(key);
        }


    }
}