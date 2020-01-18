package com.day20.Test008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            //根据服务器端的IP地址和端口号创建Socket对象
            Socket socket = new Socket("127.0.0.1", 9999);

            //创建字符输入流对象
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //创建字符输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            //输出数据
            //创建键盘录入对象
            while (true) {
                System.out.println("我说：");
                //接收键盘录入的字符串
                String words = sc.nextLine();
                if ("exit".equals(words)) {
                    br.close();
                    bw.close();
                    //关闭Socket
                    socket.close();
                    return;
                }
                //发送数据
                bw.write(words);
                //换行
                bw.newLine();
                //一定要flush
                bw.flush();
                System.out.println("收到对方的数据：" + br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
