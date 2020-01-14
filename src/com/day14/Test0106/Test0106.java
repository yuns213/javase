package com.day14.Test0106;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test0106 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();

        Student student = new Student("张三", 23);
        Student student1 = new Student("张四", 23);
        Student student2 = new Student("张五", 25);
        Student student3 = new Student("张六", 21);
        Student student4 = new Student("张七", 22);
        Student student5 = new Student("张八", 22);

        hashMap.put("安师大", student);
        hashMap.put("安大", student1);
        hashMap.put("安师2大", student2);
        hashMap.put("安师大4", student3);
        hashMap.put("安师5大", student4);
        hashMap.put("安师大挨打", student5);

        Set<String> keys = hashMap.keySet();

        for (String key : keys) {

            System.out.println("地址是:" + key + " ,学生: " + hashMap.get(key));
        }

        System.out.println("---------------------------------------------");
        Set<Map.Entry<String, Student>> set = hashMap.entrySet();


        for (Map.Entry<String, Student> s : set) {
            System.out.println(s);

        }


    }
}
