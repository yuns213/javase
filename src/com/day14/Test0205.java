package com.day14;

import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test0205 {

    public static void main(String[] args) {
        String in = new Scanner(System.in).nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        Set<String> set = map.keySet();

         //建立一个char类型的数组，用于存放每一个字符

        char[] arr = in.toCharArray();
        for (char c : arr) {

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                countingKey(map,"字母");
            } else if (c >= '0' && c <= '9') {
                countingKey(map,"数字");
            } else if (c == ' ') {
                countingKey(map,"空格");
            } else {
                countingKey(map,"其他");

            }
        }


        for (String s :set){
            System.out.println(s+"="+map.get(s));
        }

    }
    public static HashMap<String, Integer> countingKey (HashMap < String, Integer > map, String key){
        if (map.get(key) == null) {
            map.put(key, 1);
        } else {
            int i = map.get(key);
            map.put(key, i + 1);
        }
        return map;
    }
}
