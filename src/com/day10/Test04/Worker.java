package com.day10.Test04;

public class Worker {

    public Apple pickApple(CompareAble compareAble, Apple a1,Apple a2){

        Apple c = compareAble.compare(a1,a2);
        return c;
    }
}
