package com.day12;

public class Test06 {
    public static void main(String[] args) {
        //创建对象
        fun fun = new fun();
        //对象调用自定义泛型方法function
        fun.function("1");
        fun.function(3);
    }

}


class fun {
    //方法用泛型的时候  需要在返回值前面天添加一个<T>  在参数里T
    public <T> void function(T t) {
        System.out.println(t);
    }
}


