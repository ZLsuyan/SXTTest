package TestSocket;
import java.io.*;
import java.net.*;

/**
 * UDP式的聊天会话窗口
 * @author zengli
 * @date 2016/5/19
 */
public class UDPClient {
	public static void main(String[] args) {
		long n = 1000L;
		//往字节数组中写东西
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try {
		    /*
		     * DataOutputStream类拥有writeLong()等方法，
		     * 相应的，DataInputStream类也有readLong()方法。
		     */
			dos.writeLong(n);
			byte[] buf = baos.toByteArray();
		//	System.out.println(buf.length);
			DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",6666));
			//UDP是无连接的，因此客户端发送和接收数据需要写好客户端自己的端口号，方便服务器找到客户端的这个端口号
			DatagramSocket ds = new DatagramSocket(9999);
			ds.send(dp);
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
