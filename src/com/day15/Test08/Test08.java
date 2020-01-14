package com.day15.Test08;

public class Test08 {
    public static void main(String[] args) {

        Num num = new Num(20);

        Writ writA = new Writ(num);
        writA.setName("窗口a");
        Writ writB = new Writ(num);
        writB.setName("窗口b");
        Writ writC = new Writ(num);
        writC.setName("窗口c");
        Writ writD = new Writ(num);
        writD.setName("窗口d");

        writA.start();
        writB.start();
        writC.start();
        writD.start();


    }
}
