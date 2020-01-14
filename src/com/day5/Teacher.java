package com.day5;

public class Teacher {


    private String dname = "周";
    private int age = 30;
    private String content = "知识";

    //构造无参数方法
    public  Teacher(){

    }

    //构造满参数的构造方法
    public Teacher(String dname,int age,String content){
        this.content=content;
        this.age=age;
        this.dname=dname;

    }

    //getter和setter的方法


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat(){
        System.out.println("年龄为"+age+"的"+dname+"正在吃饭......");

    }

    public void teach(){
        System.out.println("年龄为"+age+"的"+dname+"正在亢奋的讲着"+content+"......");
    }
}



