package com.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Test0201 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList,"a","b","c","d","a","d");

        HashSet<String>  strings = new HashSet<>();

        strings.addAll(arrayList);

        arrayList.clear();

        arrayList.addAll(strings);

        for (String s :arrayList){
            System.out.print(s+" ");
        }




    }
}
