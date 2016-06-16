package cn.edu.hit;

/**
 * 使用自定义的异常类
 * @author zengli
 * @date 2016/5/5
 */

/**
 * 使用自定义的异常有3步：
 * 第1步：通过继承java.lang.Exception类声明自己的异常类；
 * 第2步：在适当的位置生成自定义异常的实例，并用throw语句抛出；
 * 第3步：在方法的声明部分用throws语句声明该方法可能抛出的异常。
 */
class MyException extends Exception{
	/**
	 * 这是编译器提示生成的序列号
	 */
	private static final long serialVersionUID = 1L;
	//用来记录出错码
	private int id;
	//子类的构造方法一定要调父类的构造方法，如果是显示的调用，则一定要放在第一行
	public MyException(String message,int id){
		super(message);
		this.id = id;
	}
	public int getId(){
		return id;
	}
}

public class TestMyException {
	//第3步，即在方法的声明部分用throws语句声明方法可能抛出的异常
	public void regist(int num) throws MyException{
		if(num<0){
			//第2步，即生成自定义异常的实例，并用throw抛出
			throw new MyException("登记人数为:"+num+",是一个负数，不合理",1001);
		}
		System.out.println("登记人数为："+num);
	}
	
	public void manage(){
		/*
		 * manage()方法使用抛出异常的regist(int num)方法，就必须对异常进行处理，
		 * 即进行try.....catch.....
		 */
		try{
			regist(-2);
		}catch(MyException e){
			System.out.println("出错码类型为："+e.getId());
			e.printStackTrace();
		}
		System.out.println("登记完毕！");
	}
	
	public static void main(String[] args) {
		TestMyException tme = new TestMyException();
		tme.manage();
	}
}
