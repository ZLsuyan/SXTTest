package TestSocket;
import java.io.*;
import java.net.*;

/**
 * TCP式的聊天会话窗口
 * @author zengli
 * @date 2016/5/19
 */
public class TalkServer {
	public static void main(String[] args) {
		ServerSocket server =null;
		try {
			server = new ServerSocket(8866);
		}catch(Exception e){
			System.out.println("服务器监听失败！"+e);
			System.exit(-1);
		}
		
		Socket client = null;
		try {
			client = server.accept();
			System.out.println("客户端的IP："+client.getInetAddress()+", Port#:"+client.getPort());
		}catch(Exception e){
			System.out.println("服务器端接收失败！"+e);
			System.exit(-1);
		}
		
		String line = null;
		try {
			//接收客户端数据
			DataInputStream dis = new DataInputStream(client.getInputStream());
			//向客户端发送数据
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			//接收键盘输入
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
