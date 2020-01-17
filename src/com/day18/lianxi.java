package com.day18;

import com.day6.Test04;
import com.sun.media.jfxmedia.events.NewFrameEvent;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lianxi {

    public static void main(String[] args) throws Exception {
        test04();


    }
    public static  void test12() throws  Exception{
        String str  ="";
        File file = new File("D://a.txt");
        //UUID 雪花算法
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String dateStr = sdf.format(date);
        str = "C://"+dateStr +file.getName();
        FileReader fr = new FileReader("D:\\a.txt");
        FileWriter fw = new FileWriter(str);
        char[] c = new char[2];
        int len;
        while (true) {
            len = fr.read(c);
            if (len == -1) {
                break;
            }
            fw.write(c, 0, len);
        }

        fw.flush();
        fw.close();
        fr.close();

    }


    public static  void test11() throws  Exception{
        String str = "helloWorld2";
        FileWriter fw= new FileWriter("D://cs//a.txt",true);
        fw.write(str.toCharArray());
        fw.flush();
        fw.close();
    }

    public static  void test10() throws  Exception{
        FileWriter fw = new FileWriter("D：//cs//a.txt");
        fw.write(97);
        fw.write("\r\n");
        fw.write(98);
        fw.write("\r\n");
        fw.write(97);
        fw.close();
    }

    public static void test09()throws  Exception {
        File file = new File("D://cs//a.txt");
        FileReader fr  = new FileReader(file);
        int len;
        char[] c = new  char[2];

        while (true){
            len = fr.read();
            if(len ==-1){
                break;
            }
            System.out.println(new String(c,0,len));
        }

    }
    public static void test08()throws  Exception{
        File file = new File("D://cs//a.txt");
        FileReader fr  = new FileReader(file);
        int a;
        while (true){
            a = fr.read();
            if(a ==-1){
                break;
            }
            System.out.println((char)a);
        }
    }

    public  static void test07() {
        //把d盘的图片复制到c盘
        //文件输入流读取d盘的图片
        //文件输出流把图片写入到c盘

        FileInputStream fis =null;
        FileOutputStream fos =null;
        try {
            fis  = new FileInputStream("D://cs//1.jpg");
            fos  = new FileOutputStream("c://1.jpg");
            //读
            byte[] b = new  byte[1024];
            int len;
            while (true){
                len = fis.read(b);
                if(len ==-1){
                    break;
                }
                fos.write(b,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭流 先开后关,后开先关
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void test06()throws Exception{
        File file = new File("D://cs//a.txt");
        FileInputStream fis = new FileInputStream(file);

        byte[] b  = new byte[2];
        int a;
        while (true){
            a  = fis.read(b);
            if (a ==-1){
                break;
            }
            System.out.println(new String(b,0,a));
        }


    }

    public static void test05() throws Exception {
        File file = new File("D://cs");
        FileInputStream fis = new FileInputStream(file);
        int a;
//        while(true){
//            a = fis.read();
//            if(a==-1){
//                break;
//            }
//            System.out.println((char)a);
//        }
        while ((a = fis.read()) != -1) {
            System.out.println((char) a);
        }
    }

    public static void test04() throws Exception {
        File file = new File("D://cs/a.txt");

        FileInputStream fos = new FileInputStream(file);

        int a = fos.read();

        System.out.println((char) a);
        System.out.println((char) fos.read());
        System.out.println((char) fos.read());
        System.out.println((char) fos.read());
        System.out.println((char) fos.read());
        //读取文件结尾是-1
        System.out.println(fos.read());
        System.out.println(fos.read());

    }


    public static void test03() {
        //获取文件对象
        File file = new File("D://cs");
        FileOutputStream fos = null;

        try {
            //文件输出流 从内存->硬盘
            fos = new FileOutputStream(file);
            fos.write(97);
            fos.write("\r\n".getBytes());
            fos.write(98);
            fos.write("\r\n".getBytes());
            fos.write(99);
            fos.write("\r\n".getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }

    }


    //第三种方法
    public static void test2() {
        String str = "萨达萨达撒旦";
        File file = new File("D://cs");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);

            byte[] b = str.getBytes();

            fos.write(b, 0, b.length);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //第二种方法
    public static void test1() {
        String str = "大大说的的啊";

        File f = new File("D://cs");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);


            byte[] b = str.getBytes();
            fos.write(b);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //第一种方法
    public static void test() {
        File f = new File("D://cs//a.txt");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);


            fos.write(97);
            fos.write(98);
            fos.write(99);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
