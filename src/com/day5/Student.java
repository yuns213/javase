package com.day5;

public class Student {

    private  String sname = "飞同学";
    private  int  age  =18;
    private  String content = "理解";


    public Student(String sname, int age, String content) {
        this.sname = sname;
        this.age = age;
        this.content = content;
    }

    public Student() {

    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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

    public  void eat(){
        System.out.println("年龄为"+age+"的"+sname+"正在吃饭......");
    }
    public void study(){
        System.out.println("年龄为"+age+"的"+sname+"正在专心致志的听着"+content+"......");
    }
}
