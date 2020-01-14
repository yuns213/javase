package com.day13;

import java.util.ArrayList;
import java.util.HashSet;

public class Test0205 {

    public static void main(String[] args) {

         String arr[]={"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : arr){
            hashSet.add(s);
        }

        arrayList.addAll(hashSet);

        for (String s : arrayList){
            System.out.println(s+"");
        }

    }
}
