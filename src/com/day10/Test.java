package com.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(1);

//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        list.stream().sorted((a, b) -> {
            return b - a;
        }).forEach(n -> {
            System.out.println(n);
        });

//            list.stream().forEach(n -> {
//            System.out.println(n);
//        });

    }

    public void test4() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵强");
        list.add("张强");
        list.add("张三丰");

//        list.stream().limit(2).forEach(System.out::println);

//        list.stream().skip(2).forEach(n -> {
//            System.out.println(n);
//        });

        long count = list.stream().count();
        System.out.println(count);
    }

    public void test3() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("张无忌");
        list2.add("周芷若");

        Stream.concat(list.stream(), list2.stream()).forEach(n -> {
            System.out.println(n);
        });
    }

    public void test2() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵强");
        list.add("张强");
        list.add("张三丰");

//        list2 = list.stream().filter(n -> {
//            return n.startsWith("张");
//        }).filter(n -> {
//            return n.length() == 3;
//        }).collect(Collectors.toList());
//
//        list2.stream().forEach(n -> {
//            System.out.println(n);
//        });

        list.stream().filter(n -> {
            return n.startsWith("张") && n.length() == 3;
        }).forEach(System.out::println);
    }

    public void test1() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //把list转换成stream
        Stream<String> stream = list.stream();
        Stream<String> stream2 = stream.filter(n -> {
            return n.startsWith("张");
        });

        //把stream转换成list
        list2 = stream2.collect(Collectors.toList());

        //遍历stream
//        list2.stream().forEach((String n) -> {
//            System.out.println(n);
//        });

//        list2.stream().forEach(System.out::println);

        //增强for 加强for  forEach
//        for (String str : list2) {
//            System.out.println(str);
//        }

//        list.stream().filter(n -> {
//            return n.startsWith("张");
//        }).forEach(System.out::println);

//        list.stream().filter(n -> {
//            return n.startsWith("张");
//        }).forEach((String n) -> {
//            System.out.println(n);
//        });

        list2 = list.stream().filter(n -> {
            return n.startsWith("张");
        }).collect(Collectors.toList());
    }
}
