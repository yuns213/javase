package com.day8.Test08;

public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }

    @Override
    void work() {
        System.out.println(" 工号为 "+getId()+" 的讲师 "+getName()+"在讲课");
    }
}
