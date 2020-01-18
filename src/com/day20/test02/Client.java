package com.day20.test02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Socket socket = null;
        OutputStream os = null;
        InputStream is = null;

        try {
            //连接服务器端口6666
            socket = new Socket("localhost", 8888);
            //客户端输出给服务器用(字节输出流)
            os = socket.getOutputStream();
            os.write(scanner.next().getBytes());

            String consoleStr=scanner.next();
            os.write(consoleStr.getBytes());

            //读取服务端发送的消息
             is = socket.getInputStream();
            int len;
            byte[] b = new byte[1024*2];
            //每次调用is os->都会调用里面的socekt  都会形成阻塞
            len = is.read(b);
            String msg = new String(b, 0, len);
            System.out.println("客户端收到消息：" + msg);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
