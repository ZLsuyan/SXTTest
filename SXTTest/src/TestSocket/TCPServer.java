package TestSocket;
import java.io.IOException;
import java.io.*;
import java.net.*;

/**
 * 启动网络应用程序时应该记住，首先启动server再启动client。
 * @author zengli
 * @date 2016/5/18
 */
public class TCPServer {
	public static void main(String[] args) {
		try {
			/*
			 * 阻塞式的，等待客户端的连接。
			 * 指定端口号：通过这个端口号来监听客户端的连接。
			 * 服务器端开始监听。
			 */
			ServerSocket ss = new ServerSocket(6666);
			while(true) {	
				//接收客户端连接
				//accept是阻塞式的
				Socket s = ss.accept();
				//服务器端读入数据
				DataInputStream dis = new DataInputStream(s.getInputStream());
				//readUTF是阻塞式的
				System.out.println(dis.readUTF());
				
				
				//服务器端向客户端写回数据
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				//getInetAddress()是取IP地址，getPort()是取端口号
				dos.writeUTF("Hello,"+s.getInetAddress()+" port#"+s.getPort()+" bye-bye!");
				dos.close();
				dis.close();
				s.close();
			}	
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("程序运行出错："+e);
		}
		
	}
}
