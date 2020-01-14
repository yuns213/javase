package com.day10.Test06;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args) {
        //定义两个集合分别存放两个班级
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        Student s1 = new Student("张国荣",85,16);Student s2 = new Student("云映蓉",97,18);
        Student s3 = new Student("云念念",86,15);Student s4 = new Student("张欣彩",94,18);
        Student s5 = new Student("张恬静",83,15);Student s6 = new Student("张秀丽",92,18);
        Student s7 = new Student("云含卉",86,15);Student s8 = new Student("云安蕾",91,18);
        Student s9 = new Student("张淑慧",89,15);Student s10 = new Student("云水蓉",92,18);
        Student s11 = new Student("魏名姝",61,18);Student s12 = new Student("云琬莹",95,20);
        Student s13 = new Student("张璠瑜",62,18);Student s14 = new Student("魏羡丽",98,18);
        Student s15 = new Student("云蔡琳",63,18);Student s16 = new Student("张碧凡",94,16);
        Student s17 = new Student("云芹悦",64,18);Student s18 = new Student("魏成美",100,17);
        Student s19 = new Student("刘雅容",65,18);Student s20 = new Student("张司晨",100,17);
        Student s21 = new Student("魏沈雅",66,18);Student s22 = new Student("魏芝宇",100,18);
        Student s23 = new Student("刘涵山",67,17);Student s24 = new Student("刘太文",100,19);
        Student s25 = new Student("魏路英",68,17);Student s26 = new Student("魏依然",81,18);
        Student s27 = new Student("魏书南",69,17);Student s28 = new Student("刘雨安",82,18);
        Student s29 = new Student("云平霞",62,17);Student s30 = new Student("魏朗宁",83,18);
        Student s31 = new Student("魏楠楠",71,17);Student s32 = new Student("云玉华",84,18);
        Student s33 = new Student("云紫霞",72,17);Student s34 = new Student("张宣艳",85,18);
        Student s35 = new Student("云新美",73,17);Student s36 = new Student("刘雅艳",86,18);
        Student s37 = new Student("刘梨落",74,17);Student s38 = new Student("刘贝琳",87,18);
        Student s39 = new Student("张馨香",75,17);Student s40 = new Student("刘笑蓝",88,18);
        Student s41 = new Student("云雅娴",76,17);Student s42 = new Student("云梓洁",90,18);
        Student s43 = new Student("云宛海",91,17);Student s44 = new Student("刘嘉洁",71,18);
        Student s45 = new Student("魏姝丽",92,17);Student s46 = new Student("刘寻雪",72,18);
        Student s47 = new Student("魏丝微",93,17);Student s48 = new Student("魏石瑶",73,18);
        Student s49 = new Student("刘燕星",94,19);Student s50 = new Student("张清怡",74,18);
        Student s51 = new Student("张飞薇",95,19);Student s52 = new Student("刘琦巧",75,18);
        Student s53 = new Student("魏梦蕾",96,19);Student s54 = new Student("云佳文",76,18);
        Student s55 = new Student("魏语芙",97,19);Student s56 = new Student("魏炜琳",77,18);
        Student s57 = new Student("刘佳惠",98,19);Student s58 = new Student("云若云",78,18);
        Student s59 = new Student("云词兮",99,19);Student s60 = new Student("张迷伤",79,17);
        Student s61 = new Student("张妙音",94,19);Student s62 = new Student("张欣秀",70,17);
        Student s63 = new Student("张静慧",92,19);Student s64 = new Student("张欣欣",70,17);
        Student s65 = new Student("云雅丹",93,19);Student s66 = new Student("云望慕",90,17);
        Student s67 = new Student("魏贤淑",90,19);Student s68 = new Student("云金文",81,17);
        Student s69 = new Student("刘紫薇",90,19);Student s70 = new Student("刘泽惠",82,17);
        Student s71 = new Student("云代芹",51,19);Student s72 = new Student("张滢滢",83,17);
        Student s73 = new Student("魏智宸",52,19);Student s74 = new Student("张知慧",84,17);
        Student s75 = new Student("张晶辉",53,19);Student s76 = new Student("刘平惠",85,17);
        Student s77 = new Student("魏凝蝶",54,19);Student s78 = new Student("魏秋露",86,17);
        Student s79 = new Student("张燕妮",55,19);Student s80 = new Student("张恬萍",87,17);
        Student s81 = new Student("张莉莉",90,19);Student s82 = new Student("云思恩",88,17);
        Student s83= new Student("云雅彤",90,18);Student s84 = new Student("张芳馥",90,18);
        Student s85 = new Student("刘慈心",82,17);Student s86 = new Student("云梦露",87,17);
        Student s87 = new Student("张笑翠",82,16);Student s88 = new Student("云小萱",86,16);
        Student s89 = new Student("刘映雪",82,20);Student s90 = new Student("刘肖倩",86,18);
        Student s91= new Student("魏沙羽",90,18);Student s92 = new Student("云若淑",90,17);
        Student s93 = new Student("云冰夏",81,19);Student s94 = new Student("刘娅欣",90,20);
        Student s95 = new Student("刘双玉",89,19);Student s96 = new Student("刘水云",56,16);
        Student s97 = new Student("刘燕岚",83,19);Student s98 = new Student("刘夜梦",80,17);
        Student s99 = new Student("云妙海",89,19);Student s100 = new Student("云好洁",76,18);

       list1.add(s1);list1.add(s2);list1.add(s3);list1.add(s4);
       list1.add(s5);list1.add(s6);list1.add(s7);list1.add(s8);
       list1.add(s9);list1.add(s10);list1.add(s11);list1.add(s12);
       list1.add(s13);list1.add(s14);list1.add(s15);list1.add(s16);
       list1.add(s17);list1.add(s18);list1.add(s19);list1.add(s20);
       list1.add(s21);list1.add(s22);list1.add(s23);list1.add(s24);
       list1.add(s25);list1.add(s26);list1.add(s27);list1.add(s28);
       list1.add(s29);list1.add(s30);list1.add(s31);list1.add(s32);
       list1.add(s33);list1.add(s34);list1.add(s35);list1.add(s36);
       list1.add(s37);list1.add(s38);list1.add(s39);list1.add(s40);
       list1.add(s41);list1.add(s42);list1.add(s43);list2.add(s44);
       list2.add(s45);list2.add(s46);list2.add(s47);list2.add(s48);
       list2.add(s49);list2.add(s50);list2.add(s51);list2.add(s52);
       list2.add(s53);list2.add(s54);list2.add(s55);list2.add(s56);
       list2.add(s57);list2.add(s58);list2.add(s59);list2.add(s60);
       list2.add(s61);list2.add(s62);list2.add(s63);list2.add(s64);
       list2.add(s65);list2.add(s66);list2.add(s67);list2.add(s68);
       list2.add(s69);list2.add(s70);list2.add(s71);list2.add(s72);
       list2.add(s73);list2.add(s74);list2.add(s75);list2.add(s76);
       list2.add(s77);list2.add(s78);list2.add(s79);list2.add(s80);
       list2.add(s81);list2.add(s82);list2.add(s83);list2.add(s84);
       list2.add(s85);list2.add(s86);list2.add(s87);list2.add(s88);
       list2.add(s89);list2.add(s90);list2.add(s91);list2.add(s92);
       list2.add(s93);list2.add(s94);list2.add(s95);list2.add(s96);
       list2.add(s97);list2.add(s98);list2.add(s99);list2.add(s100);


       //将班级2全部放在list1里共同计算.用addAll()方法
       list1.addAll(list2);

        //把过滤获取的姓张的人转化成Steam流.
        Stream<Student> zhang = list1.stream()
                //filter过滤,student则是里面的元素
                .filter(student -> {
                    //通过student类的get方法获取姓名进行过滤
                    return student.getName().startsWith("张");
                });
        //再用Stream的count统计方法打印出姓张的人数
        System.out.println(zhang.count());


        //因为是排序不用减少数据,所以这里不用转化Stream流,用stream方法的排序在存放到新的list集合里
        List<Student> sort = list1.stream()
                //sorted默认用的是升序.利用里面的Comparator.comparing将(Student的get方法年龄进行排序)
                // reversed是sorted提供的降序功能,再用collect功能的collectors.toList转化成集合.
                .sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        sort.stream().forEach(System.out::println);
        System.out.println("-----------------------------------");

        List<Student> price = sort.stream()
                //同上.
                .sorted(Comparator.comparing(Student::getPrice)).collect(Collectors.toList());
        price.stream().forEach(System.out::println);

        //在排好序的集合中去找姓张的前三个
        Stream<Student> ceil = price.stream()
                .filter(student -> {
                    //获取姓张的人,
                    return student.getName().startsWith("张");
                }).filter(student -> {
                    //再在姓张的人中获取年龄小于18的
                    return student.getAge()<18;
                    //用limit方法获取前三个
                }).limit(3);
        System.out.println("----------------------------");
        ceil.forEach(System.out::println);


//        System.out.println(sort);







    }
}