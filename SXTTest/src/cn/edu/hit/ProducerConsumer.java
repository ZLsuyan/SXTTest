package cn.edu.hit;

/**
 * 【经典的生产者消费者问题】
 * 【注意】：wait和sleep的区别：
 *          1、wait是Object的方法，sleep是Thread（java.lang）的方法；
 *          2、wait时释放了锁，别的线程还可以访问锁定对象；
 *             sleep时仍持有锁，别的线程也不可以访问锁定对象；
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
 * 【东西类】
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
 * 【篮子类】
 * 用栈模拟篮子，后进入的先被拿出 *
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
 * 【生产者类】
 */
class Producer implements Runnable{
	SyncStack ss = null;
	Producer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0;i<20;i++){
			WoTou wt = new WoTou(i);
			System.out.println("生产者生产----"+wt);
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
 * 【消费者类】
 */
class Consumer implements Runnable{
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run() {
		for(int i=0;i<20;i++){
			WoTou wt = ss.pop();
			System.out.println("消费者消费——————————————————————————————————————————————————————"+wt);
			try {
				Thread.sleep((int)Math.random()*2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}