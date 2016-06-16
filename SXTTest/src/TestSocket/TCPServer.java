package TestSocket;
import java.io.IOException;
import java.io.*;
import java.net.*;

/**
 * ��������Ӧ�ó���ʱӦ�ü�ס����������server������client��
 * @author zengli
 * @date 2016/5/18
 */
public class TCPServer {
	public static void main(String[] args) {
		try {
			/*
			 * ����ʽ�ģ��ȴ��ͻ��˵����ӡ�
			 * ָ���˿ںţ�ͨ������˿ں��������ͻ��˵����ӡ�
			 * �������˿�ʼ������
			 */
			ServerSocket ss = new ServerSocket(6666);
			while(true) {	
				//���տͻ�������
				//accept������ʽ��
				Socket s = ss.accept();
				//�������˶�������
				DataInputStream dis = new DataInputStream(s.getInputStream());
				//readUTF������ʽ��
				System.out.println(dis.readUTF());
				
				
				//����������ͻ���д������
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				//getInetAddress()��ȡIP��ַ��getPort()��ȡ�˿ں�
				dos.writeUTF("Hello,"+s.getInetAddress()+" port#"+s.getPort()+" bye-bye!");
				dos.close();
				dis.close();
				s.close();
			}	
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������г���"+e);
		}
		
	}
}
