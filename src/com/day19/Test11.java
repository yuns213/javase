package com.day19;

import com.day19.Test07.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        Student s1 = new Student("三中三", 12, "男");
        Student s2 = new Student("思韵", 12, "女");
        Student s3 = new Student("玩撒", 12, "男");
        Student s4 = new Student("贺卫方", 12, "男");

        List<Student> list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("D://cs//stus.txt"));
            for (int i = 0; i < 4; i++) {

                oos.writeObject(list.get(i));
                oos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
