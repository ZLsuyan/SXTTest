package cn.edu.hit;

/**
 * 写一个会产生死锁的程序
 * 需要注意：1、每一个方法要不要同步，需要考虑清楚。
 *           2、如果一个方法做了同步，另一个没有做同步，
 *              那么别的线程可以自由的访问那个非同步的方法，并且可能会对同步的方法产生影响。
 *           3、如果要保护某一个类中的某一个对象，需要仔细考虑对这个对方操作的所有方法是否需要加同步。
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
		//调用父类Thread的构造方法，给线程命名
		super(s);
	}
	static Object o1 = new Object();
	static Object o2 = new Object();
	public void run(){
		//输出当前执行线程的名字
		System.out.println("线程————————————"+Thread.currentThread().getName());
		if(flag == 1){
			//t1锁住o1
			synchronized(o1){
				try{
					//进入睡眠后，会将CPU让给t2线程，因此t2会锁住o2
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