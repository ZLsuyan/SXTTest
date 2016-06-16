package TestSocket;
import java.io.IOException;
import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[] args) {
		//����Socket(String host,int port)
		try {
			//�ͻ�����������
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
			System.err.println("����������ʧ�ܣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
