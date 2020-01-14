package com.day4;

public class Test4 {

    public static void main(String[] args) {

        char achar = getChar(100);
        System.out.println("字符:"+achar);

    }

    public static char  getChar(int num) {
        char ch = (char)num;
        //通过ascll码判断是否是数字
        if((int)ch>=48&&(int)ch<=57){
                return ch;
        }
        //通过ascll码判断是否是小写字母
         if((int)ch>=65&&(int)ch<=90){
                return ch;
        }//通过ascll码判断是否是大写字母
         if((int)ch>=97&&(int)ch<=122){
                return ch;
        }else{
                return ' ';
        }


    }


}
