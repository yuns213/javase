package com.day2;

public class test8 {

    public static void main(String[] args) {

        get(58);
    }
    public  static void get(int score){

        if(score >=80 && score<=100){
            System.out.println("优秀");

        }if(score >=70 && score<=79){
            System.out.println("良");

        }if(score >=60 && score<=69){
            System.out.println("及格");

        }else{
            System.out.println("傻子");

        }
    }
}
