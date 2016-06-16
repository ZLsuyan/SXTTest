package TestSocket;
import java.io.IOException;
import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) {
		//方法Socket(String host,int port)
		try {
			//客户端申请连接
			Socket s = new Socket("127.0.0.1",6666);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("hello server!");
			dos.flush();
			
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			dos.close();
			s.close();
		} catch (ConnectException connExc) {
			connExc.printStackTrace();
			System.err.println("服务器连接失败！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
