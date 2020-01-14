package com.day5;

public class TestALL {

    public static void main(String[] args) {
        //Dog类测试
        Dog dog = new Dog("旺财", 2);

        dog.showMsg();

        //2.student和teacher类的测试
        Teacher teacher = new Teacher();
        teacher.setDname("周老师");
        teacher.setAge(30);
        teacher.setContent("Java面向对象的内容");
        teacher.eat();
        teacher.teach();

        Student student = new Student("韩同学", 18, "java面向对象的内容");
        student.eat();
        student.study();

        //3,Card类的测试
        Card card = new Card("黑桃", "A");
        card.showCard();

        //4.circle的测试
        Circle circle = new Circle(8);
        circle.showArea();
        circle.showPerimeter();

        //5.Code和Manager的测试
        Manager manager = new Manager("James", "9527", 15000, 3000);
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("======================");
        Coder coder = new Coder();
        coder.setName("Kobe");
        coder.setId("0025");
        coder.setSalary(10000);
        coder.intro();
        coder.showSalary();
        coder.work();

        //6.MyDate的测试
        MyDate date = new MyDate(1900, 1, 1);
        date.showDate();
        date.isBi();

        //7.Book 的测试

        Book b1 = new Book("No0001", "Java入门", "isbn943247483", 38.8, "2015‐01‐01");
        Book b2 = new Book("No0002", "Mysql数据库", "isbn23867592", 46.8, "2016‐01‐01");
        Book b3 = new Book("No0003", "JavaWeb实战", "isbn387648797524", 58.8, "2017‐01‐01");
        System.out.println("*********************************************");
        Book b = b1;
        if (b2.getPrice() > b.getPrice()) {
            b = b2;
        }
        //通过b来一个个比较,得出最大数再赋值给b..
        if (b3.getPrice() > b.getPrice()) {
            b = b3;
        }
        //用get获取每个元素
        System.out.println("最贵的书是：" + b.getbookb() + "," + b.getshuhao() + "," + b.getIsbn() + "," + b.getPrice() + "," + b.getDate());
    }
}






