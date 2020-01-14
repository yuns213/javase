package com.day14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test0201 {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        Set<String> keys = map.keySet();

        while (keys.size()<5){
            String in = new Scanner(System.in).nextLine();
             String[] strs = in.split(",");
             String s = strs[0];
             int i = Integer.parseInt(strs[1]);
             map.put(s,i);

        }

        for ( String key:keys){
            System.out.println("名字:"+key+" 年龄:"+map.get(key));
        }

    }
}
