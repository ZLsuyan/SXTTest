package cn.edu.hit;
import java.io.*;

/**
 * ����������ָ���ļ������ļ��н���д������
 * @author zengli
 * @date 2016/5/18
 */
public class TestPrintStream1 {
	public static void main(String[] args) {
		PrintStream ps = null;
		try{
			FileOutputStream fos = new FileOutputStream("E:/Program Files/MyEclipseWorkspace/SXTTest/src/cn/edu/hit/TestPrintStream1.txt");
	        ps = new PrintStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//�����out��������Ϊָ���ӡ������ps�����������psָ����ļ����������
		if(ps!=null){
			System.setOut(ps);
		}	
		System.out.println("����һ�����Դ�ӡ�����ļ���");
		int len = 0;
		for(char c = 0;c <= 60000;c++){
			System.out.print(c+" ");
			while(len++ >=100){
				System.out.println();
				len = 0;
			}
		}
		
	}
}
