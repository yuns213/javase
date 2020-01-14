package com.day10.Test05;

public class Test05 {
    public static void main(String[] args) {
        Player player = new Player();


        String select = "法力角色";
        System.out.println("选择:"+select);
        //这是
        FightAble f = player.FightAbleselect(select);
        f.specialFight();
        f.commonFight();

        System.out.println("=================");
        String select1 ="武力角色";
        System.out.println("选择:"+select1);
        FightAble f2 = player.FightAbleselect(select1);
        f2.specialFight();
        f2.commonFight();
    }



}
