package com.day12.Test07;
//这是实现类确定泛型的写法
public class Imple01 implements Inter<String> {

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
