package com.day19;

import java.io.*;

public class Test12 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("D://cs//a.txt"));
            bw = new BufferedWriter(new FileWriter("D://cs//b.txt"));


            while (true) {
                String a = br.readLine();
                if (a == null) {
                    break;
                }

                bw.write(a);
                bw.newLine();


            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } finally {
            try {

                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        f4();

    }

    public static void f4(){
        FileReader f = null;
        try {
            f= new FileReader("D://cs//b.txt");
            int len ;
// 定义字符数组，作为装字符数据的容器
//            char[] cbuf = new char[1];
// 循环读取
            while ((len = f.read())!=-1) {
                System.out.print((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }finally {
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
