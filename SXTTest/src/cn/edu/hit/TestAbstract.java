package cn.edu.hit;

/**
 * ���Գ�����
 * @author zengli
 * @date 2016/5/5
 */

/**
 * �ؼ��㣺��class��Ȩ�����η�ֻ����default��public��
 * 1��ӵ�г��󷽷�������뱻����Ϊ�����ࣻ
 * 2����������뱻�̳У�
 * 3�����󷽷����뱻��д��
 * 4�����󷽷�ֻ�ж��壬û��ʵ�֣�û�з����壻
 * 5�������಻�ܱ�ʵ������
 * 6��������Ĭ����public�Ķ���ֻ����Public�ģ�
 * 7���������еĳ�Ա����Ĭ��Ϊ��default�������ɼ����ġ�
 */
abstract class Abstract{
	//�������еĳ�Ա����Ĭ��Ϊdefault�������ɼ�����
	int i = 8;
	//int j = 0;
	//���������Լ��ķ���
	void A(){
		System.out.println("���ǳ��������Լ��ķ���"+i);
	}
	
	//���󷽷���ֻ��������û��ʵ�֣�û�з�����
	//���󷽷�ֻ������Ϊprotected��public �ģ���Ϊ��Ҫ������д
	protected abstract void B();
	
}

public class TestAbstract extends Abstract{
	/**
	 * ʵ���˳������еĳ��󷽷�
	 */
	 protected void B(){
		i = 9;	
		System.out.println("��ʵ�֣���д���˳������еĳ��󷽷������õ��˳������еĳ�Ա����"+i);
	//	System.out.println(j);
	}
	
	//���ࣨʵ���ࣩ���Լ�����ӵķ���
	void C(){
		System.out.println("�������ࣨʵ���ࣩ�Լ�����ӵķ���"+i);
	}
	
	public static void main(String[] args) {
		TestAbstract ta = new TestAbstract();
		ta.A();
		ta.B();
		ta.C();
		ta.A();
		System.out.println();
		//������ͨ��Ա����i���������
		TestAbstract tata = new TestAbstract();
		tata.A();
		tata.C();
		tata.B();
		tata.C();
	}
}