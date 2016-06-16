package cn.edu.hit;

/**
 * 测试object类的toString()方法的返回值
 * 返回getClass().getName() + '@' + Integer.toHexString(hashCode())
 * @author zengli
 * @date 2016/5/4
 */
public class TestToString {
	public static void main(String[] args){
		Dog d = new Dog();
		System.out.println("这个Dog类的 实例对象d的toString字符串为："+d);  
		System.out.println("Dog类的实例对象d所在的类为："+d.getClass());
		System.out.println("Dog类的实例对象d所在的类的名字为："+d.getClass().getName());
		System.out.println("获得父类的：");
	    System.out.println(d.getClass().getSuperclass());
	    System.out.println(d.getClass().getSuperclass().getName());
	    System.out.println();
	    TestToString tts = new TestToString();
	    System.out.println(tts);
	    System.out.println(tts.getClass());
	    System.out.println(tts.getClass().getName());
	    System.out.println();
	    System.out.println(tts.getClass().getSuperclass());
	    System.out.println(tts.getClass().getSuperclass().getName());
	}
}

class Dog{
	public String toString(){
		return "我是一只哈士奇，汪汪~";
	}
}