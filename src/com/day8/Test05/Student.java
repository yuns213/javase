package com.day8.Test05;

public class Student extends Person {
    private int count;


    public Student() {

    }

    public Student(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void test(){
        System.out.println(super.getName()+"同学,考试得了:"+count+"分");
    }
}
