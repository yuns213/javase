package com.day15;

public class Test02 {

    public static void main(String[] args) {
        //请描述以下方式创建线程的步骤

        //继承threadl类的方式
        /* 1. 定义一个子类继承Thread类
        * 2.重写Thread 的方法 将需要被多线程执行的代码存储到该方法当中
        * 3.创建Thread类的子类的创建线程对象
        * 直接调用子类从Thread类继承的start方法 开启一个线程 开启一个线程 (调用该线程的run方法)*/

        //实现Runnable接口方式
        /* 1.定义一个类实现Runnable接口, 覆盖Runnable接口中的run方法 将 线程要运行的代码存在该run方法中
           2.通过Thread类创建线程对象,将Runable接口的子类实例对象作为实际参数传递给Thread类的构造方法*/


    }
}
