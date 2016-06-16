package TestSocket;
import java.io.*;
import java.net.*;

/**
 * UDPʽ������Ự����
 * @author zengli
 * @date 2016/5/19
 */
public class UDPClient {
	public static void main(String[] args) {
		long n = 1000L;
		//���ֽ�������д����
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try {
		    /*
		     * DataOutputStream��ӵ��writeLong()�ȷ�����
		     * ��Ӧ�ģ�DataInputStream��Ҳ��readLong()������
		     */
			dos.writeLong(n);
			byte[] buf = baos.toByteArray();
		//	System.out.println(buf.length);
			DatagramPacket dp = new DatagramPacket(buf,buf.length,new InetSocketAddress("127.0.0.1",6666));
			//UDP�������ӵģ���˿ͻ��˷��ͺͽ���������Ҫд�ÿͻ����Լ��Ķ˿ںţ�����������ҵ��ͻ��˵�����˿ں�
			DatagramSocket ds = new DatagramSocket(9999);
			ds.send(dp);
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
