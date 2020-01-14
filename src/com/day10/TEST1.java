package com.day10;

import java.util.Arrays;

public class TEST1 {

    public static void main(String[] args) {




        Integer[] arr = {1,8,4,6,8};

        Arrays.sort(arr,(a,b)->{
            //正序这是a-b
            return b-a;
        });
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }



}


