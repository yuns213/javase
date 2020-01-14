package com.day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Xun1 {

    public static void main(String[] args) {

        Collection<String> s = new ArrayList<>();

       s.add("啊啊啊啊");
       s.add("啊啊啊啊");
       s.add("啊啊啊啊");

       Iterator<String> it = s.iterator();
       //hasNext 是 有值就返回true ,没有值就返回flase
       while (it.hasNext()){

           String s1 =it.next();
           System.out.println(s1);
       }


    }
}
