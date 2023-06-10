package Networking;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Step1Test {

    public static void main(String[] args) {
        // URL地址：http://www.runoob.com/index.html?language=cn#javase
        // 1. 要求输出：协议、主机名、路径、端口、请求参数
        // ********** Begin **********
        try
        {
            URL url = new URL("http://www.runoob.com/index.html?language=cn#javase");
            System.out.println("协议为：" + url.getProtocol());
            System.out.println("主机名：" + url.getHost());
            System.out.println("路径：" + url.getPath());
            System.out.println("端口：" + url.getPort());
            System.out.println("请求参数：" + url.getQuery());
        }catch(MalformedURLException e)
        {
            e.printStackTrace();
        }

        // 2.输出百度的所有主机地址
        try{
            InetAddress[] bd=InetAddress.getAllByName("www.baidu.com");
            for (InetAddress ad :
                    bd) {
                System.out.println(ad);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        // ********** End **********


    }

}
