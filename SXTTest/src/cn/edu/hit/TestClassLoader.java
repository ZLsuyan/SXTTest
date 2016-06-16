package cn.edu.hit;

/**
 * JDK����ClassLoader
 * @author zengli
 * @date 2016/6/1
 */
public class TestClassLoader {
	public static void main(String[] args) {
		/*
		 * String����jdk�ĺ����࣬
		 * jdk�ĺ����඼����Bootstrap class loader�����صġ�
		 * �������Bootstrap class loader��������û�����ֵġ���ü���������null��
		 */
		System.out.println(String.class.getClassLoader());
		
		//Extension class loader�������jre/lib/extĿ¼�µ�һЩ��չ��
		System.out.println(com.sun.crypto.provider.AESCipher.class.getClassLoader().getClass().getName());
		
		//�û��Զ����������Application Class Loader�����ص�
		System.out.println(TestClassLoader.class.getClassLoader().getClass().getName());
		
		//����ͨ��ClassLoader.getSystemClassLoader()�����Application class loader
		System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
		
		
		System.out.println();
		ClassLoader c = TestClassLoader.class.getClassLoader();
		while(c != null){
			System.out.println(c.getClass().getName());
			c = c.getParent();
		}
	}
}
