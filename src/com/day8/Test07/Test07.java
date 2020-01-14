package com.day8.Test07;

public class Test07 {

    public static void main(String[] args) {

        Manage manage = new Manage("m110","老王",10000.0);
        manage.eat();
        manage.Work();


        Cook cook = new Cook("c110","小王",6000.0);
        cook.eat();
        cook.Work();



    }

}
