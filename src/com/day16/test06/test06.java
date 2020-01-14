package com.day16.test06;

public class test06 {
    public static void main(String[] args) {

        invoke(()->{
            System.out.println("导演拍电影啦");
        });
        invoke(()->
            System.out.println("导演拍电影啦")
        );



    }

    private static void invoke(Director director){
        director.makeMovie();
    }

}
