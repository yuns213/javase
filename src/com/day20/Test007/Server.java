package com.day20.Test007;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
//1,创建服务器，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket clientSocket = serverSocket.accept();
//获取Socket的输入
        InputStream in = clientSocket.getInputStream();
//创建目的地的字节输出流
        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("D://cs//a.jpg"));
//把Socket输入流中的数据，写入目的地的字节输出流中
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
//写入目的地的字节输出流中
            fileOut.write(buffer, 0, len);

        }
//获取Socket的输出流,作用：写反馈信息给客户端
        OutputStream out = clientSocket.getOutputStream();
//写反馈信息给客户端
        out.write("图片上传成功".getBytes());
        out.close();
        fileOut.close();
        in.close();
        clientSocket.close();


    }

}


