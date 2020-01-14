package com.day13;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Test0203 {

    public static void main(String[] args) {

        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};

        LinkedList<String> strings = new LinkedList<>();

        for(String s : strs){
           boolean b =  strings.contains(s);
            if (b !=true){
                strings.add(s);
            }

        }

        for (String s : strings){
            System.out.print(s+" ");
        }
        System.out.println("\n-----------------------------\n");

        Iterator<String> it = strings.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
        }

    }
}
