package TestSocket;
import java.io.*;
import java.net.*;

/**
 * TCP式的聊天会话窗口
 * @author zengli
 * @date 2016/5/19
 */
public class TalkClient {
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("127.0.0.1",8866);
		}catch(Exception e){
			System.out.println("客户端尝试连接失败！"+e);
			System.exit(-1);
		}
		
		try {
			//客户端先从键盘输入数据，并向服务器端发送。
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
