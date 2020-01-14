package com.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test0301 {
    public static void main(String[] args) {
        HashMap<String, HashMap<Integer, String>> map = new HashMap<>();
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        map1.put(001, "李晨");
        map1.put(002, "范冰冰");
        map.put("java基础班", map1);

        map2.put(001, "马云");
        map2.put(002, "马化腾");
        map.put("java就业班", map2);

        Set<String> key = map.keySet();
        Set<Integer> key1 = map1.keySet();


        for (String s : key) {
            for (int i : key1) {
                System.out.println(map.get(s).get(i));
            }
        }

        Set<Map.Entry<String, HashMap<Integer, String>>> set = map.entrySet();

        Iterator<Map.Entry<String, HashMap<Integer, String>>> set1 = set.iterator();

        while (set1.hasNext()){
            Map.Entry<String,HashMap<Integer,String>>  y=set1.next();
            System.out.println(y);
        }
    }


}
