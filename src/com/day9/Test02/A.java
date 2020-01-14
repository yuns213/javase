package com.day9.Test02;

interface  A {

    public abstract void showA();

    public default  void showB(){
        System.out.println("BBBB");
    }

}
