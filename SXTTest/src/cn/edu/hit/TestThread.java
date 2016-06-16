package cn.edu.hit;

/**
 * 测试线程
 * 事实上，线程Thread本身也是实现了Runnable接口，推荐使用实现接口这种实现线程的写法，用接口比较灵活；
 * @author zengli
 * @date 2016/5/13
 */
public class TestThread {
	public static void main(String[] args) {
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0;i < 10;i ++){
			System.out.println("Main Thread："+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Main Thread is over!");
		r.shutdown();	
	}
}

class Runner1 implements Runnable{
	private boolean flag = true;
	
	public void run(){
	//	System.out.println(Thread.currentThread().isAlive());
		while(flag){
			for(int i = 0;i < 10;i ++){
				System.out.println("Thread"+i+":"+i);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					return;
				}
			}				
			
		}	
	}
	
	public void shutdown(){
		flag = false;
	}
}
