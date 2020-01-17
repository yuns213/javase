package com.day19;

import java.io.*;

public class lianxi {
    public static void main(String[] args) throws Exception{
        f4();
    }


public static void f4()throws Exception{
    FileReader f = new FileReader("D://cs//b.txt");

    int len ;
// 定义字符数组，作为装字符数据的容器
    char[] cbuf = new char[16];
// 循环读取
    while ((len = f.read(cbuf))!=-1) {
        System.out.print(new String(cbuf,0,len));
    }
}

    public static void f3(){
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("D://cs//d.txt"));

            bw.write("一场雨");
            bw.newLine();
            bw.write("把我困在这里");
            bw.newLine();



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void f2() {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("D://cs//b.txt"));

            while (true) {
                String  line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void f() {
        FileInputStream fis = null;


        FileOutputStream fos = null;

        try {
            long stary = System.currentTimeMillis();
            fis = new FileInputStream("D://cs//a.txt");


            fos = new FileOutputStream("D://a.txt");

            while (true) {
                int a = fis.read();
                if (a == -1) {
                    break;
                }
                fos.write(a);
            }
            long end = System.currentTimeMillis();

            System.out.println(stary - end);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void f1() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            long stary = System.currentTimeMillis();
            fis = new FileInputStream("D://cs//a.txt");
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream("D://a.txt");
            bos = new BufferedOutputStream(fos);

            while (true) {
                int a = bis.read();
                if (a == -1) {
                    break;
                }
                bos.write(a);
            }
            long end = System.currentTimeMillis();

            System.out.println(stary - end);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } finally {
            try {
                bos.close();
                fos.close();
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
