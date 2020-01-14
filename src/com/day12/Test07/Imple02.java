package com.day12.Test07;
//这是实现不确定泛型的类型,测试时再确定
public class Imple02<E> implements Inter<E>{
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
