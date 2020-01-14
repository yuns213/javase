package com.day12;

import java.util.ArrayList;
import java.util.Collection;

public class Test05 {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList();

        c.add("火男");
        c.add("球女");
        c.add("锤石");
        c.add("泰坦");
        c.add("吸血鬼");

        for (String str:c){
            System.out.println(str);

        }



    }
}
