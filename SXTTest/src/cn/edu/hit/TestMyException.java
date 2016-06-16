package cn.edu.hit;

/**
 * ʹ���Զ�����쳣��
 * @author zengli
 * @date 2016/5/5
 */

/**
 * ʹ���Զ�����쳣��3����
 * ��1����ͨ���̳�java.lang.Exception�������Լ����쳣�ࣻ
 * ��2�������ʵ���λ�������Զ����쳣��ʵ��������throw����׳���
 * ��3�����ڷ���������������throws��������÷��������׳����쳣��
 */
class MyException extends Exception{
	/**
	 * ���Ǳ�������ʾ���ɵ����к�
	 */
	private static final long serialVersionUID = 1L;
	//������¼������
	private int id;
	//����Ĺ��췽��һ��Ҫ������Ĺ��췽�����������ʾ�ĵ��ã���һ��Ҫ���ڵ�һ��
	public MyException(String message,int id){
		super(message);
		this.id = id;
	}
	public int getId(){
		return id;
	}
}

public class TestMyException {
	//��3�������ڷ���������������throws����������������׳����쳣
	public void regist(int num) throws MyException{
		if(num<0){
			//��2�����������Զ����쳣��ʵ��������throw�׳�
			throw new MyException("�Ǽ�����Ϊ:"+num+",��һ��������������",1001);
		}
		System.out.println("�Ǽ�����Ϊ��"+num);
	}
	
	public void manage(){
		/*
		 * manage()����ʹ���׳��쳣��regist(int num)�������ͱ�����쳣���д���
		 * ������try.....catch.....
		 */
		try{
			regist(-2);
		}catch(MyException e){
			System.out.println("����������Ϊ��"+e.getId());
			e.printStackTrace();
		}
		System.out.println("�Ǽ���ϣ�");
	}
	
	public static void main(String[] args) {
		TestMyException tme = new TestMyException();
		tme.manage();
	}
}
