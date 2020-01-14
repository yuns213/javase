package com.day14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test0204 {

    public static void main(String[] args) {
        String in = new Scanner(System.in).nextLine();

        char[] chart = in.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        Set<Character> key = map.keySet();

        int count = 1;
        for (char c : chart){

            if(!map.containsKey(c)){
                map.put(c,count);
            }else{
                int q= map.get(c);
                map.put(c,q+1);
            }
        }

        for (char c:key){
            System.out.print(c+"("+map.get(c)+")");
        }

    }
}
