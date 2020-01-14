package com.day14;

public class STest0106 {

    /*请用代码实现如下需求:
    1.写一个方法实现获取字符串某个索引上的字符的功能
    2.写一个测试测试方法调用上面写的方法,使用thows方式进行处理异常,并在main方法中调用这个测试方法
    3.再写一个测试测试方法调用上面写的方法,使用try...catch方式进行处理异常,并在main方法中调用这个测试方法*/


    public static void main(String[] args) {

        // a = 10;错误

        // int[] a = {1,2,3};
        // System.out.println(a[3]);运行时异常:RuntimeException

        try {
            char a = getChar("aqweqeqd", 5);
            //打印第五个字符
            System.out.println(a);
        } catch (Exception e) {
            //如果错了,则打印错误类型
            System.out.println(e);
        }

    }

    // 写一个方法实现获取字符串某个索引上的字符的功能  如果要在类或者方法中使用exception就要用throws 而不是throw
    public static char getChar(String str, int i) throws Exception {

        if (str == null) {
            //如果在方法体内抛异常,这需要用throw  不能用throws
            throw new Exception("字符串不能为null");
        }

        if (str == "") {
            throw new Exception("字符串不能为\"\"");
        }

        if (i > str.length() - 1) {
            throw new Exception("索引越界异常");
        }
        char chart = str.charAt(i);
        return chart;
    }
}

