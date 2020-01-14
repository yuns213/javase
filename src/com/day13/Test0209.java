package com.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test0209 {

    public static void main(String[] args) {

        ArrayList<String> array1 = new ArrayList();
        ArrayList<String> array2 = new ArrayList();
        Collections.addAll(array1,"a", "b", "a", "c", "d");
        Collections.addAll(array2,"e", "f", "a", "d", "g");

        HashSet<String> hashSet  = new HashSet<>();

        for (String s : array1){
            hashSet.add(s);
        }
        for (String s : array2){
            hashSet.add(s);
        }
        for (String s : hashSet){
            System.out.print(s+" ");
        }





    }
}
