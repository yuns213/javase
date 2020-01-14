package com.day4;

public class Stest5 {

    public static void main(String[] args) {

        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        //这个表示的就是平均分

        int avg = getAvg(arr);

        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(avg>arr[i]){
                count +=1;
            }
        }
        System.out.println("高于平均分:"+avg+"的 个数有"+count+"个");
    }


    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        int avg = sum /arr.length;
        return avg;
    }


}
