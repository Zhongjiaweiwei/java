package lab03_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Part2_receive {
    //    ServletSocket(int port) 创建绑定到指定端口的服务器套接字
    //    Socket accept() 监听要连接到此的套接字并接受它
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(54321);
        Socket socket=serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        //一次读一个数组
        byte[] bytes=new byte[1024];
        int len=inputStream.read(bytes);
        String result=new String(bytes,0,len);
        System.out.println("接收到的数据："+result);
        //释放资源
        socket.close();
        serverSocket.close();
    }
}
