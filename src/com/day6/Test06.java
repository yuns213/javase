package com.day6;

import java.util.ArrayList;

public class Test06 {

    public static void main(String[] args) {




        Teacher t1 = new Teacher("姚明", 23, "打篮球");
        Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
        Teacher t3 = new Teacher("薛之谦", 45, "踢足球");

        ArrayList<Teacher> arrayList = new ArrayList<>();

        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);

        for (int i = 0; i < arrayList.size(); i++) {
            Teacher teacher = arrayList.get(i);
            teacher.show();

        }
        for (int i = 0; i <arrayList.size() ; i++) {

            Teacher teacher = arrayList.get(i);
            if (teacher.getAge()>40){
                teacher.setLike("打高尔夫");
                teacher.show();
            }
        }

    }
}
