package TestSocket;
import java.io.*;
import java.net.*;

/**
 * UDP式的聊天会话窗口
 * @author zengli
 * @date 2016/5/19
 */
public class UDPServer {
	public static void main(String[] args) {
		/*
		 * 定义了1024个字节用来接收数据。
		 * 本例子其实最后只接收了8个字节，后面的1016个字节都是空的。
		 */
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		DatagramSocket ds;
		try {
			ds = new DatagramSocket(6666);
			while(true) {
				try {
					ds.receive(dp);
					/*
					 * 从字节数组往外读东西。
					 * ByteArrayInputStream类没有把字节数组转换为long类型数的方法，
					 * 而DataInputStream类的readLong()方法可以。
					 */
					ByteArrayInputStream bais = new ByteArrayInputStream(buf);
					DataInputStream dis = new DataInputStream(bais);
					/*
				     * DataOutputStream类拥有writeLong()等方法，
				     * 相应的，DataInputStream类也有readLong()方法。
				     */
					System.out.println(dis.readLong());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		
	}
}
