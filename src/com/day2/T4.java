package com.day2;

public class T4 {
    public static void main(String[] args) {
        int a1=10,a2=11,b1=12,b2=13;
        boolean flag= true;
        boolean flag1= true;
        boolean flag2= true;
        boolean flag3= true;

        if(a1%2==0){
            flag = true;
        }else if(a1%2==1){
            flag = false;
        }

        if(a2%2==0){
            flag1 = true;
        }else if(a2%2==1){
            flag1 = false;
        }
        if(b1%2==0){
            flag2 = false;
        }else if(b1%2==1){
            flag2 = true;
        }
        if(b2%2==0){
            flag3 = false;
        }else if(b2%2==1){
            flag3 = true;
        }

            System.out.println("10是偶数吗?"+flag);
            System.out.println("11是偶数吗?"+flag1);
            System.out.println("12是奇数吗?"+flag2);
            System.out.println("13是奇数吗?"+flag3);


    }
}
