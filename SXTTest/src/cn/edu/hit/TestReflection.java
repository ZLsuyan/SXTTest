package cn.edu.hit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射机制的应用
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
			//动态实例化对象
			Object o = c.newInstance();
			//获得这个类有多少种方法，通过 【类的对象.getMethods()】方法，返回类型是一个Method类型的数组
			Method[] methods = c.getMethods();
			for(Method m : methods){
				//获得一个方法的名字，通过getName()方法。
				if(m.getName().equals("mm")) {
					m.invoke(o);
				}
				if(m.getName().equals("m1")) {
					m.invoke(o,1,2);
					//拿到一个方法的参数的类型，通过getParameterTypes()方法
					for(Class paramType : m.getParameterTypes()){
						System.out.println(paramType.getName());
					}
				}
				//拿到方法的返回值类型：通过getReturnType()方法
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