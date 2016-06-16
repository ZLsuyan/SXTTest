package TestSocket;
import java.io.*;
import java.net.*;

/**
 * TCPʽ������Ự����
 * @author zengli
 * @date 2016/5/19
 */
public class TalkClient {
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("127.0.0.1",8866);
		}catch(Exception e){
			System.out.println("�ͻ��˳�������ʧ�ܣ�"+e);
			System.exit(-1);
		}
		
		try {
			//�ͻ����ȴӼ����������ݣ�����������˷��͡�
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String readLine = null;
			readLine = br.readLine();
			while(!readLine.equalsIgnoreCase("bye")) {
				System.out.println("Client:"+readLine);
				dos.writeUTF(readLine);
				dos.flush();
				System.out.println("Server:"+dis.readUTF());
				readLine = br.readLine();
				}
			dos.close();
			dis.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
