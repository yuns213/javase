package com.day20.test04;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        //创建服务器对象
        ServerSocket serverSocket = null;
        try {
            //创建服务器端口
            serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
                InputStream is = null;
                OutputStream os = null;
            //收消息(读取)
            while (true){
                //这是获取读取的输入字节流
                is = socket.getInputStream();
                //读取字节流的的每个长度

                //读取的为每一个数组
                byte[] b  = new byte[1024];
                int  len = is.read(b);
                if ("end".equals(new String(b,0,len))){
                    System.out.println("服务器收到消息,结束连接");
                    is.close();
                    socket.close();
                    return;
                }

                System.out.println("服务器收到消息: "+new String(b,0,len));


            //回消息(输出)
                //先在控制台打印输出的内容
                String str = new Scanner(System.in).next();
                //然后将此内容通过服务器的话方法输出到字节输出流
                os = socket.getOutputStream();
                //用直接字节输出流的write方法传到客户端
                os.write(str.getBytes());
                if ("end".equals(str)){
                    os.close();
                    socket.close();
                    return;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


