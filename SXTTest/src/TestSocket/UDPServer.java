package TestSocket;
import java.io.*;
import java.net.*;

/**
 * UDPʽ������Ự����
 * @author zengli
 * @date 2016/5/19
 */
public class UDPServer {
	public static void main(String[] args) {
		/*
		 * ������1024���ֽ������������ݡ�
		 * ��������ʵ���ֻ������8���ֽڣ������1016���ֽڶ��ǿյġ�
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
					 * ���ֽ����������������
					 * ByteArrayInputStream��û�а��ֽ�����ת��Ϊlong�������ķ�����
					 * ��DataInputStream���readLong()�������ԡ�
					 */
					ByteArrayInputStream bais = new ByteArrayInputStream(buf);
					DataInputStream dis = new DataInputStream(bais);
					/*
				     * DataOutputStream��ӵ��writeLong()�ȷ�����
				     * ��Ӧ�ģ�DataInputStream��Ҳ��readLong()������
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
