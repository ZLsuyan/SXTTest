package TestSocket;
import java.io.*;
import java.net.*;

/**
 * TCPʽ������Ự����
 * @author zengli
 * @date 2016/5/19
 */
public class TalkServer {
	public static void main(String[] args) {
		ServerSocket server =null;
		try {
			server = new ServerSocket(8866);
		}catch(Exception e){
			System.out.println("����������ʧ�ܣ�"+e);
			System.exit(-1);
		}
		
		Socket client = null;
		try {
			client = server.accept();
			System.out.println("�ͻ��˵�IP��"+client.getInetAddress()+", Port#:"+client.getPort());
		}catch(Exception e){
			System.out.println("�������˽���ʧ�ܣ�"+e);
			System.exit(-1);
		}
		
		String line = null;
		try {
			//���տͻ�������
			DataInputStream dis = new DataInputStream(client.getInputStream());
			//��ͻ��˷�������
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			//���ռ�������
			BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client:"+dis.readUTF());
			line = br.readLine();
			while(!line.equalsIgnoreCase("bye")) {
				dos.writeUTF(line);
				dos.flush();
				System.out.println("Server:"+line);
				System.out.println("Client"+dis.readUTF());
				line = br.readLine();
			}
			dis.close();
			dos.close();
			br.close();
			server.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
