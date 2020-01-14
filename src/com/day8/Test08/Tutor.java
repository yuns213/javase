package com.day8.Test08;

public class Tutor extends  Teacher {

    public Tutor() {
    }

    public Tutor(int id, String name) {
        super(id, name);
    }

    @Override
    void work() {
        System.out.println(" 工号为 "+getId()+" 的助教 "+getName()+"在帮助学生解决问题");
    }
}
