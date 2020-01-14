package com.day14;

import java.util.HashMap;
import java.util.Set;

public class Test0202 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("柳岩", 2100);
        map.put("张亮", 1700);
        map.put("诸葛亮", 1800);
        map.put("灭绝师太", 2600);
        map.put("东方不败", 3800);

        int i = map.get("柳岩");

        map.put("柳岩",i+300);


        Set<String>  set = map.keySet();

        for (String s : set){
            System.out.println(s+"工资是:"+map.get(s));

        }


    }


}
