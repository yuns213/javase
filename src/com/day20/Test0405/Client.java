package day20.Test0405;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Socket socket = null;

        OutputStream os = null;

        try {
            //连接服务器端口
            socket = new Socket("127.0.0.1", 8888);
            //字节输出流接收套接字端点的字节类型
            os = socket.getOutputStream();
            //字符串接受打印在控制台内容
            String str = new Scanner(System.in).next();
            //用write将字符串转换成byte用端点输出到服务器
            os.write(str.getBytes());


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
