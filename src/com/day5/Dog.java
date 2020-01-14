package com.day5;

public class Dog {

    private String dname = "汪汪";
    private int  age = 5;

    //无参构造方法
    public Dog(){

    }
    //满参构造方法
    public Dog(String dname, int age) {
        this.dname = dname;
        this.age = age;
    }
    //以下是getter和setter方法
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showMsg(){
        System.out.println("狗的名字为:"+dname+",年龄为:"+age);
    }

}
