package com.day13;

import java.util.HashSet;
import java.util.Iterator;

public class Test0105 {
    public static void main(String[] args) {

        HashSet<String> str = new HashSet<>();
        str.add("zhangsan");
        str.add("lisi");
        str.add("wangwu");
        str.add("zhangsan");

        Iterator<String> it = str.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
        }

    }



}
