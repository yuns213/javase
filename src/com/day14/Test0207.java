package com.day14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test0207 {

    public static void main(String[] args) {
        String in = new Scanner(System.in).nextLine();

        String[] str = in.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        Set<String> key = map.keySet();


        for (String s : str) {
            //这个用containskey判断map里有没有这个元素
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int i = map.get(s);
                map.put(s, i + 1);
            }
        }

        for (String s : key) {
            System.out.println(s + "=" + map.get(s));
        }
    }

}
