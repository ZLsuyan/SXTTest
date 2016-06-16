package cn.edu.hit;

/**
 * JDK内置ClassLoader
 * @author zengli
 * @date 2016/6/1
 */
public class TestClassLoader {
	public static void main(String[] args) {
		/*
		 * String类是jdk的核心类，
		 * jdk的核心类都是由Bootstrap class loader来加载的。
		 * 但是这个Bootstrap class loader加载器是没有名字的。获得加载器会是null。
		 */
		System.out.println(String.class.getClassLoader());
		
		//Extension class loader负责加载jre/lib/ext目录下的一些扩展类
		System.out.println(com.sun.crypto.provider.AESCipher.class.getClassLoader().getClass().getName());
		
		//用户自定义的类是由Application Class Loader来加载的
		System.out.println(TestClassLoader.class.getClassLoader().getClass().getName());
		
		//可以通过ClassLoader.getSystemClassLoader()来获得Application class loader
		System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
		
		
		System.out.println();
		ClassLoader c = TestClassLoader.class.getClassLoader();
		while(c != null){
			System.out.println(c.getClass().getName());
			c = c.getParent();
		}
	}
}
