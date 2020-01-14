package com.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test0206 {

    public static void main(String[] args) {


        ArrayList<String> arr = new ArrayList<>();

        arr.add("abc");
        arr.add("bcd");


        HashMap<Character,Integer> map =new HashMap<>();

        Set<Character> set = map.keySet();

        for (String s : arr){
            char[]a = s.toCharArray();
            for (char c :a){
                if (!map.containsKey(c)){
                    map.put(c,1);
                }else{
                    int i = map.get(c);
                    map.put(c,i+1);
                }

            }
        }

        for (char c :set) {

            System.out.print(c+"="+map.get(c)+",");
        }
    }
}
