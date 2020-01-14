package com.day13;

import java.util.ArrayList;
import java.util.Collections;

public class Test0110 {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
           str = add("23123","12312","1312","12312");

        for (String s : str){
            System.out.print(s+" ");
        }
    }

    public static ArrayList<String> add(String... str){
        ArrayList<String> strings = new ArrayList<>();

//        Collections.addAll(strings,str);
        for (String s:str){
            strings.add(s);
        }


        return strings;


    }

}
