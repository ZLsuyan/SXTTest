package cn.edu.hit;

/**
 * 测试接口
 * @author zengli
 * @date 2016/5/5
 */

/**
 * 关键点：【接口，本质上是一种特殊的抽象类，这种抽象类是只包含常亮和方法的定义，而没有变量和方法的实现】
 * 1、接口拥有抽象类的本质特性；
 * 2、java中只有单继承，但是可以实现多个接口；
 * 3、接口必须被实现，接口中的方法必须被重写；
 * 4、接口中的成员变量默认是也只能是public static final的；
 * 5、接口中的所有方法默认是抽象方法，而且这些抽象方法默认是也只能是public的。
 */
interface PetCarer{
	//接口中的所有方法默认为抽象的public的
	void feed();
	void play();
}

class Workers implements PetCarer{
	//普通类中的方法默认是default的
	public void feed() throws ArithmeticException{
		try{
			System.out.println("工人喂食");
	//		System.out.println(2/0);
			/*
			 * 当上面的语句抛出异常时，写在try里面的出现异常的语句的后面的语句都不会被执行了，
			 * 例如下面的这句输出语句就不会被执行
			 */
			System.out.println("这是try里面异常语句后面的语句");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("这是finally里面的语句");
		}
		
	}
	public void play(){
		System.out.println("工人和它完");
	}
}

public class TestInterface{
	public static void main(String[] args) {
		Workers w = new Workers();
		w.feed();
		//但是写在出现异常问题的方法后面的语句还会被执行，例如下面的w.play()方法
		w.play();
	}
}