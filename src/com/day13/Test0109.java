package com.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test0109 {

    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList();

        Collections.addAll(s,33,11,77,55);

        Collections.sort(s);
        System.out.println(s);

        Collections.shuffle(s);
        System.out.println(s);

        Collections.sort(s, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i :s){
            System.out.print(i+" ");
        }


    }
}
