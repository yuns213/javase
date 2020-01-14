package com.day4;

public class Stest1 {
    public static void main(String[] args) {

        int[] arr = {12,33,25,6,16};

        int min = 12;
        for (int i = 0; i <=arr.length-1; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("数组最小值为:"+min);
    }

}