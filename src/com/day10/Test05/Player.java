package com.day10.Test05;

public class Player {

    public FightAble FightAbleselect(String str){
        if ("法力角色".equals(str)){
            //直接通过返回值去调用实现类
            return new Master();
        }if ("武力角色".equals(str)){
            return new Warrior();
        }
        return null;
    }
}
