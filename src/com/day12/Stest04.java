package com.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Stest04 {

    public static void main(String[] args) {

        String[] str= {"0","1","2","3","4","5"};

        Swap(str,3,5);
        for (String i:str){
            System.out.print(i+" ");
        }
        System.out.println("\n------------------");

        Integer[] integer= {0,1,2,3,4,5};
        Swap(integer,2,4);
        for (int i:integer){
            System.out.print(i+" ");
        }


    }

    public static <T> void Swap (T[] arr,int x,int y){


        T t =  arr[y];
        arr[y] = arr[x];
        arr[x] = t;



    }
}
