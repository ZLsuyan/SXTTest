package cn.edu.hit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ������Ƶ�Ӧ��
 * @author zengli
 * @date 2016/6/1
 */
public class TestReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "A";
		try {
			Class c = Class.forName(str);
			//��̬ʵ��������
			Object o = c.newInstance();
			//���������ж����ַ�����ͨ�� ����Ķ���.getMethods()������������������һ��Method���͵�����
			Method[] methods = c.getMethods();
			for(Method m : methods){
				//���һ�����������֣�ͨ��getName()������
				if(m.getName().equals("mm")) {
					m.invoke(o);
				}
				if(m.getName().equals("m1")) {
					m.invoke(o,1,2);
					//�õ�һ�������Ĳ��������ͣ�ͨ��getParameterTypes()����
					for(Class paramType : m.getParameterTypes()){
						System.out.println(paramType.getName());
					}
				}
				//�õ������ķ���ֵ���ͣ�ͨ��getReturnType()����
				if(m.getName().equals("getS")) {
					Class returnType = m.getReturnType();
					System.out.println(returnType.getName());
				}
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}


class A {
	static {
		System.out.println("A loaded!");
	}
	
	public A(){
		System.out.println("A constructed!");
	}
	
	int i;
	String s;
	
	public void m1(int i,int j){
		this.i = i+j;
		System.out.println(this.i);
	}
	
	public void mm() {
		System.out.println("mm invoked");
	}
	
	public String getS() {
		return s;
	}
}