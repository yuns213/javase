package com.day12;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;

public class Stest03 {
    public static void main(String[] args) {

        Collection<String> arr = new ArrayList();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("c");
        arr.add("b");
        arr.add("b");
        arr.add("b");
        arr.add("a");
                            //静态方法直接调用arraylist集合需要加上括号才能读取出arr是集合类型
        System.out.println(frequency((ArrayList<String>) arr, "b"));


    }
                                //记得当arraylist定义了泛型的时候,用作静态方法的时候不要忘记加
    public static int frequency(ArrayList<String> arr ,String key){

        int count = 0;

        for(String i:arr){

            if (key.equals(i)){
                count +=1;
            }
        }

        return  count;
    }
}
