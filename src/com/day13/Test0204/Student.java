package com.day13.Test0204;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String six;


    public Student() {
    }

    public Student(String name, int age, String six) {
        this.name = name;
        this.age = age;
        this.six = six;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(six, student.six);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, six);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", six='" + six + '\'' +
                '}';
    }
}
