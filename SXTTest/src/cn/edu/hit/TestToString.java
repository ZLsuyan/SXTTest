package cn.edu.hit;

/**
 * ����object���toString()�����ķ���ֵ
 * ����getClass().getName() + '@' + Integer.toHexString(hashCode())
 * @author zengli
 * @date 2016/5/4
 */
public class TestToString {
	public static void main(String[] args){
		Dog d = new Dog();
		System.out.println("���Dog��� ʵ������d��toString�ַ���Ϊ��"+d);  
		System.out.println("Dog���ʵ������d���ڵ���Ϊ��"+d.getClass());
		System.out.println("Dog���ʵ������d���ڵ��������Ϊ��"+d.getClass().getName());
		System.out.println("��ø���ģ�");
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
		return "����һֻ��ʿ�棬����~";
	}
}