package Test0302;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

public class Test0302 {

    public static void main(String[] args) {
        //这个是学科集合
        HashSet<HashSet> Subject = new HashSet<>();
        //这个是班级集合
        HashSet<Student> Class = new HashSet<>();
        HashSet<Student> Class1 = new HashSet<>();
        //往学科集合添加班级集合
        Subject.add(Class);
        Subject.add(Class1);


        Student student1 = new Student("张三",16);
        Student student2 = new Student("李四",24);
        Student student3 = new Student("艾希",43);
        Student student4 = new Student("宇文",23);
        Student student5 = new Student("张三",16);
        Student student6 = new Student("涵曦",15);
        Student student7 = new Student("诗雨",45);
        Student student8 = new Student("李玉",19);
        Student student9 = new Student("美玉",17);
        Student student10 = new Student("提奚",21);

        //往班级集合添加学生
        Class.add(student1);
        Class.add(student2);
        Class.add(student3);
        Class.add(student4);
        Class.add(student5);
        Class.add(student10);
        Class1.add(student6);
        Class1.add(student7);
        Class1.add(student8);
        Class1.add(student9);

        //添加外部hashset迭代器  ..
        Iterator<HashSet> it  = Subject.iterator();
        //用死循环遍历外部迭代器
        while (it.hasNext()){
            //获取内部hashset的元素
            HashSet h = it.next();
            //添加内部hashset迭代器
            Iterator<Student> it1 = h.iterator();
            //再弄一个死循环去获取学生元素
            while (it1.hasNext()){
                //用student对象去接收遍历出来的元素
                Student s = it1.next();
                //打印遍历出来的studen学生元素
                System.out.println(s);
            }

        }


        System.out.println("---------------------------------");
        //用增强for .再用内部的hashset获取外部元素
        for (HashSet<Student> h :Subject){
                //嵌套一个增强for循环. 用student对象去获取内部元素的元素
            for (Student s : h){
                System.out.println(s);

            }
        }


    }
}