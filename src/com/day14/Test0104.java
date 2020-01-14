package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test0104 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");


        Set<String> keys = map.keySet();

        Iterator<String> it = keys.iterator();

        while (it.hasNext()){
            String key = it.next();

            System.out.println(key+"->"+map.get(key));
        }
    }
}
