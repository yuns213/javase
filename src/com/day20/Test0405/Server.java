package day20.Test0405;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {





        try {
            //创建服务器端口
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                //创建套接字(服务器和客户端的端点),因为是等待客户段链接,所以放在while里面.每次连接的都是新的客户端
                Socket socket =serverSocket.accept() ;
                byte[] b = new byte[1024];
                InputStream is = socket.getInputStream();
                int len = is.read(b);

                if (len == -1) {
                    break;
                }
                System.out.println("客户端发送了消息: " + new String(b, 0, len));

                is.close();
                socket.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
