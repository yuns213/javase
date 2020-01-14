package com.day10.Test05;

interface FightAble {


    abstract void specialFight();

    default  void commonFight(){
        System.out.println("普通攻击");
    }



}
