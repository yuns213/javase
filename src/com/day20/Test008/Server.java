package com.day20.Test008;

import javafx.beans.property.Property;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Server {

    public static void main(String[] args) {
        System.out.println("服务器启动......");
        ServerSocket serverSocket = null;
        Socket socket = null;

        //字符输入流
        BufferedReader br = null;
        //字符输出流
        BufferedWriter bw = null;
        Properties p = new Properties();

        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            //创建键盘录入对象
            serverSocket = new ServerSocket(9999);
            Scanner sc = new Scanner(System.in);
            //创建服务器端Socket

            while (true) {
                //接收对方的数据
                //得到客户端对应的对象
             socket = serverSocket.accept();

            //字符输入流
             br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //字符输出流
             bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));


             fi = new FileInputStream("D://cs//file.txt");
             fo = new FileOutputStream("D://cs//file.txt", true);
                p.load(fi);

                String[] strs = br.readLine().split("=");
               Set<String> set = new HashSet<>();
               set.addAll(p.stringPropertyNames());
               set.add(strs[0]);

                for (String s1 : set) {
                    if (s1 == strs[0] && p.getProperty(s1) == strs[1]) {
                        //发送给对方
                        bw.write("客户登录成功!");
                        bw.newLine();
                        bw.flush();

                    } else if (s1 == strs[0] && p.getProperty(s1) != strs[1]) {
                        //发送给对方
                        bw.write("客户密码错误!");
                        bw.newLine();
                        bw.flush();
                    } else if (s1 != null && p.getProperty(s1) != null) {
                        fo.write((strs[0] + "=" + strs[1]).getBytes());
                        //发送给对方
                        bw.write("客户注册成功!");
                        bw.newLine();
                        bw.flush();
                    } else {
                        bw.write("客户注册失败!");
                        bw.newLine();
                        bw.flush();
                    }
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fo.close();
                fi.close();
                br.close();
                bw.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
