package com.day4;

public class Stest3 {

    public static void main(String[] args) {

        int[]  nums = {5,10,15};

        int[] newArr = {};

        for (int i = 0; i <=nums.length-1 ; i++) {

                newArr[i] = nums[i]*2;

        }

        for (int i = 0; i <=newArr.length-1; i++) {
            System.out.println("nums数组:"+nums);
            System.out.println("newArr新数组" + newArr);

        }
    }
}
