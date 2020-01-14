package com.day13;


import java.util.ArrayList;

import java.util.HashSet;
import java.util.Random;

public class Test0301 {

    public static void main(String[] args) {
        HashSet<Integer> red = new HashSet<>();
        HashSet<Integer> blue = new HashSet<>();
        ArrayList<Integer> zhu  =new ArrayList<>();

        Random random =new Random();

        for (int i = 0; i <5 ; i++) {

            int red1 = random.nextInt(33);
            red.add(red1);
        }

        int blue1 = random.nextInt(16);
        blue.add(blue1);

        zhu.addAll(red);
        zhu.addAll(blue);
        System.out.println("红色:");
        for (int i = 0; i < zhu.size()-1; i++) {

            System.out.println(  zhu.get(i));
        }

        System.out.println("蓝色:"+zhu.get(6));
        
    }
}
