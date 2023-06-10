package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        /*
         * 接收客户端发送的数据
         */
        // 1.创建服务器端DatagramSocket，指定端口
        DatagramSocket socket = new DatagramSocket(12345);
        System.out.println("****服务器端已经启动，等待客户端发送数据");


        // 2.创建数据报，用于接收客户端发送的数据
        // 创建字节数组，指定接收的数据包的大小1024
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);


        // 3.接收客户端发送的数据
        socket.receive(packet);


        // 4.读取数据
        String info = new String(data, 0, packet.getLength());
        System.out.println("我是服务器，客户端说：" + info);


        // 5.关闭资源
        socket.close();
    }
}