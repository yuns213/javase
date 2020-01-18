package com.day20.Test006;

    import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server {

    /*
        TCP通讯服务器端
     */

        public static void main(String[] args) {
            System.out.println("服务器启动......");
            try {
                //创建键盘录入对象
                Scanner sc = new Scanner(System.in);
                //创建服务器端Socket
                ServerSocket serverSocket = new ServerSocket(9999);

                //得到客户端对应的对象
                Socket socket = serverSocket.accept();

                //字符输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //字符输出流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                while (true){
                    //接收对方的数据
                    System.out.println("客户端说："+br.readLine());
                    System.out.println("我说：");
                    String words = sc.nextLine();
                    if ("exit".equals(words)) {
                        br.close();
                        bw.close();
                        socket.close();
                        serverSocket.close();
                        return;
                    }
                    //发送给对方
                    bw.write(words);
                    bw.newLine();
                    bw.flush();
                }

            }catch (Exception e){
                e.printStackTrace();
            }

    }

}
