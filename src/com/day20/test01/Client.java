package com.day20.test01;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Socket socket = null;
        OutputStream os = null;

        try {
            //连接服务器端口6666
            socket = new Socket("localhost", 6666);
            //输出给服务器用(字节输出流)
            os = socket.getOutputStream();
            os.write(scanner.next().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
