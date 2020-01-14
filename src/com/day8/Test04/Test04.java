package com.day8.Test04;

public class Test04 {
    public static void main(String[] args) {
        //第四题
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

abstract class A {

    int numa = 10;

    //切记抽象类的方法没有方法体{}!
    public abstract void showA();
}

abstract class B extends A {

    int numb = 20;

    //切记抽象类的方法没有方法体{}!
    public abstract void showB();
}

class C extends B {

    int numc = 30;

    @Override
    public void showA() {
        System.out.println("A类中numa:" + numa);
    }

    @Override
    public void showB() {
        System.out.println("B类中numb:" + numb);
    }

    public void showC(){
        System.out.println("C类中mumc:"+ numc);
    }


}
