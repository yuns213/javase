package com.day20.test02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {


        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            //开启了一个服务器端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //阻塞(accept方法)---第一次阻塞
            socket = serverSocket.accept();


            //收消息,服务器获取读取(字节流)
             is= socket.getInputStream();
            int len;
            byte[] b = new  byte[1024];

            len = is.read(b);
               String msg = new String(b,0,len);
            System.out.println("服务器收到消息"+msg);

            //回消息,服务器输出到客户端
            String s = new Scanner(System.in).next();
            os = socket.getOutputStream();
            os.write(s.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                is.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
