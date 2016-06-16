package cn.edu.hit;

/**
 * ���Խӿ�
 * @author zengli
 * @date 2016/5/5
 */

/**
 * �ؼ��㣺���ӿڣ���������һ������ĳ����࣬���ֳ�������ֻ���������ͷ����Ķ��壬��û�б����ͷ�����ʵ�֡�
 * 1���ӿ�ӵ�г�����ı������ԣ�
 * 2��java��ֻ�е��̳У����ǿ���ʵ�ֶ���ӿڣ�
 * 3���ӿڱ��뱻ʵ�֣��ӿ��еķ������뱻��д��
 * 4���ӿ��еĳ�Ա����Ĭ����Ҳֻ����public static final�ģ�
 * 5���ӿ��е����з���Ĭ���ǳ��󷽷���������Щ���󷽷�Ĭ����Ҳֻ����public�ġ�
 */
interface PetCarer{
	//�ӿ��е����з���Ĭ��Ϊ�����public��
	void feed();
	void play();
}

class Workers implements PetCarer{
	//��ͨ���еķ���Ĭ����default��
	public void feed() throws ArithmeticException{
		try{
			System.out.println("����ιʳ");
	//		System.out.println(2/0);
			/*
			 * �����������׳��쳣ʱ��д��try����ĳ����쳣�����ĺ������䶼���ᱻִ���ˣ�
			 * ������������������Ͳ��ᱻִ��
			 */
			System.out.println("����try�����쳣����������");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("����finally��������");
		}
		
	}
	public void play(){
		System.out.println("���˺�����");
	}
}

public class TestInterface{
	public static void main(String[] args) {
		Workers w = new Workers();
		w.feed();
		//����д�ڳ����쳣����ķ����������仹�ᱻִ�У����������w.play()����
		w.play();
	}
}