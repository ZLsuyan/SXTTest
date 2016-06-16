package cn.edu.hit;

/**
 * 测试抽象类
 * @author zengli
 * @date 2016/5/5
 */

/**
 * 关键点：【class的权限修饰符只能是default和public】
 * 1、拥有抽象方法的类必须被声明为抽象类；
 * 2、抽象类必须被继承；
 * 3、抽象方法必须被重写；
 * 4、抽象方法只有定义，没有实现，没有方法体；
 * 5、抽象类不能被实例化；
 * 6、抽象类默认是public的而且只能是Public的；
 * 7、抽象类中的成员变量默认为是default（本包可见）的。
 */
abstract class Abstract{
	//抽象类中的成员变量默认为default（本包可见）的
	int i = 8;
	//int j = 0;
	//抽象类中自己的方法
	void A(){
		System.out.println("我是抽象类中自己的方法"+i);
	}
	
	//抽象方法，只有声明，没有实现，没有方法体
	//抽象方法只能声明为protected和public 的，因为需要子类重写
	protected abstract void B();
	
}

public class TestAbstract extends Abstract{
	/**
	 * 实现了抽象类中的抽象方法
	 */
	 protected void B(){
		i = 9;	
		System.out.println("我实现（重写）了抽象类中的抽象方法，并得到了抽象类中的成员变量"+i);
	//	System.out.println(j);
	}
	
	//子类（实现类）中自己新添加的方法
	void C(){
		System.out.println("我是子类（实现类）自己新添加的方法"+i);
	}
	
	public static void main(String[] args) {
		TestAbstract ta = new TestAbstract();
		ta.A();
		ta.B();
		ta.C();
		ta.A();
		System.out.println();
		//测试普通成员变量i是属于类的
		TestAbstract tata = new TestAbstract();
		tata.A();
		tata.C();
		tata.B();
		tata.C();
	}
}