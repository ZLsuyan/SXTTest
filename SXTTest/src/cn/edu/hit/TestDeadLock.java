package cn.edu.hit;

/**
 * дһ������������ĳ���
 * ��Ҫע�⣺1��ÿһ������Ҫ��Ҫͬ������Ҫ���������
 *           2�����һ����������ͬ������һ��û����ͬ����
 *              ��ô����߳̿������ɵķ����Ǹ���ͬ���ķ��������ҿ��ܻ��ͬ���ķ�������Ӱ�졣
 *           3�����Ҫ����ĳһ�����е�ĳһ��������Ҫ��ϸ���Ƕ�����Է����������з����Ƿ���Ҫ��ͬ����
 * @author zengli
 * @date 2016/5/13
 */
public class TestDeadLock {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("t1");
		Thread1 t2 = new Thread1("t2");	
		
		t1.flag = 1;
		t2.flag = 2;
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	public int flag;
	
	Thread1(String s){
		//���ø���Thread�Ĺ��췽�������߳�����
		super(s);
	}
	static Object o1 = new Object();
	static Object o2 = new Object();
	public void run(){
		//�����ǰִ���̵߳�����
		System.out.println("�̡߳�����������������������"+Thread.currentThread().getName());
		if(flag == 1){
			//t1��סo1
			synchronized(o1){
				try{
					//����˯�ߺ󣬻ὫCPU�ø�t2�̣߳����t2����סo2
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				synchronized(o2){
					System.out.println("1");
				}
			}
		}
		if(flag == 2){
			synchronized(o2){
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				synchronized(o1){
					System.out.println("2");
				}
			}
		}
	}
}