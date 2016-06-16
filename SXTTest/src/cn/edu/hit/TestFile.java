package cn.edu.hit;
import java.io.File;
import java.io.IOException;

/**
 * �ļ���File����
 * @author zengli
 * @date 2016/5/9
 */
public class TestFile {
	public static void main(String[] args) {
		String separator = File.separator;
		String dictionary1 = "E:"+separator+"Program Files"+separator+"Workspace"+separator+"SXTTest";
		/*
		 * ע�⣺"/"��windows��linuxƽ̨�¶�������Ϊ�ָ�����
		 *      ����"\"ֻ��������windowsƽ̨��
		 *      Ȼ����java�����У�"\"����Ϊת���ַ���
		 *      �����Ҫ�÷�б��"\"������д��"\\"��
		 *      ��������д�ֲ��ʺ���linuxƽ̨�ˣ��������д���Ƿ��Եġ�
		 */
		//String dictionary = "E:/Program Files/Workspace/SXTTest";    //"/"��windows��linux�¶�����Ϊ�ָ���
		String filename1 = "FileTest.doc";
		File file1 = new File(dictionary1,filename1);
		if(file1.exists()){
			System.out.println("�ļ��ľ���·����"+file1.getAbsolutePath());
			System.out.println("�ļ���С��"+file1.length());
			System.out.println("�ļ�����"+file1.getName());
			/*
			 * ��class�ļ�λ��ĳ���������ʱ��
			 * �������ϲ�·��ʱ���������İ����������ϲ�·��
			 * ��Ϊ�ҵ��������ϲ�����ϲ�·��
			 */
			System.out.println("�ϲ�·����"+file1.getParent());
			System.out.println("���һ���޸ľ����ض�ʱ���ms����"+file1.lastModified()+" ms.");
			System.out.println("���ļ��𣿣�"+file1.isFile());
			System.out.println();
		}else{
			//mkdir()��������Ŀ¼��mkdirs()����һϵ��Ŀ¼
			file1.getParentFile().mkdirs();
			try{
				file1.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		
		String dictionary2 = "mydir1"+separator+"mydir2";
		String filename2 = "FileTest.txt";
		File file2 = new File(dictionary2,filename2);
		if(file2.exists()){
			System.out.println("�ļ��ľ���·����"+file2.getAbsolutePath());
			System.out.println("�ļ���С��"+file2.length());
			System.out.println("�ļ�����"+file2.getName());
			System.out.println("��·����"+file2.getParent());
			System.out.println("���һ���޸ľ����ض�ʱ���ms����"+file2.lastModified()+" ms.");
			System.out.println("��Ŀ¼�𣿣�"+file2.isDirectory());
		}else{
			file2.getParentFile().mkdirs();
			try{
				file2.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
	}
}
