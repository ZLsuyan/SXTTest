package cn.edu.hit;

/**
 * ����������������������⡿
 * ��ע�⡿��wait��sleep������
 *          1��wait��Object�ķ�����sleep��Thread��java.lang���ķ�����
 *          2��waitʱ�ͷ�����������̻߳����Է�����������
 *             sleepʱ�Գ�����������߳�Ҳ�����Է�����������
 * @author zengli
 * @date 2016/5/18 
 */
public class ProducerConsumer {
	public static void main(String[] args) {
		SyncStack ss = new SyncStack();
		Producer p =new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();
		new Thread(c).start();
	}
}

/**
 * �������ࡿ
 */
class WoTou{
	int id;
	WoTou(int id){
		this.id = id;
	}
	public String toString() {
		return "WoTou"+id;
	}
}


/**
 * �������ࡿ
 * ��ջģ�����ӣ��������ȱ��ó� *
 */
class SyncStack{
	int index = 0;
	WoTou[] arrWT = new WoTou[6];
	
	public synchronized void push(WoTou wt){
		while(index == arrWT.length){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		arrWT[index] = wt;
		index++;
	}
	
	public synchronized WoTou pop(){
		while(index == 0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.notify();
		index--;
		return arrWT[index];
	}
}


/**
 * ���������ࡿ
 */
class Producer implements Runnable{
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0;i<20;i++){
			WoTou wt = new WoTou(i);
			System.out.println("����������----"+wt);
			try {
				Thread.sleep((int)Math.random()*2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ss.push(wt);
		}
	}
}


/**
 * ���������ࡿ
 */
class Consumer implements Runnable{
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0;i<20;i++){
			WoTou wt = ss.pop();
			System.out.println("���������ѡ�����������������������������������������������������������������������������������������������������������"+wt);
			try {
				Thread.sleep((int)Math.random()*2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}