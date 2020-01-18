package com.day20.test01;

import java.io.IOException;
import java.io.InputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("服务器等待连接");

        Socket socket = null;
        InputStream is = null;
        try {
            //开启了一个服务器端口
            ServerSocket serverSocket = new ServerSocket(6666);
            //阻塞(accept方法)
            socket = serverSocket.accept();

            System.out.println("链接上了");
            //服务器获取读取(字节流)
             is= socket.getInputStream();
            int len;

            byte[] b = new  byte[1024];

            while (true){
                len = is.read(b);
                if(len==-1){
                    break;
                }

                System.out.println(new String(b,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
