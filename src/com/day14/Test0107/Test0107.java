package com.day14.Test0107;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test0107 {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap = new HashMap<>();

        Student student = new Student("张三",23);
        Student student1 = new Student("张四",23);
        Student student2 = new Student("张三",23);
        Student student3 = new Student("张六",21);
        Student student4 = new Student("张七",22);
        Student student5 = new Student("张八",22);

        hashMap.put(student,"市安达");
        hashMap.put(student1,"安师大");
        hashMap.put(student2,"安大");
        hashMap.put(student3,"安师2大");
        hashMap.put(student4,"安师大4");
        hashMap.put(student5,"安师5大");

        Set<Student> keys = hashMap.keySet();

        for (Student key:keys){

            System.out.println("地址是:"+ hashMap.get(key)+" ,学生: "+key);
        }

        System.out.println("---------------------------------------------");

        Set<Map.Entry<Student,String>> set = hashMap.entrySet();



        for (Map.Entry<Student,String> s :set){
            System.out.println(s);

        }





    }
}
