package com.lem.thread3.wait_release_lock;

public class Main {
	public static void main(String[] args) throws InterruptedException{
//		demo1();
//		demo2();
//		demo3();
//		demo4();
		demo5();
	}

	
	
	/**
	 * 方法notify()执行后，并不立马释放锁；随机唤醒一个线程，可多次调用
	 * @throws InterruptedException 
	 */
	public static void demo2() throws InterruptedException{
		Object obj = new Object();
		ThreadA ta = new ThreadA(obj);
		NotifyThread nt = new NotifyThread(obj);
		ta.start();
		Thread.sleep(1000);
		nt.start();
		
//		begin wait()
//		Thread-1begin wait()
//		Thread-1	end wait()
//			end wait()
	}
	
	/**
	 * wait()后调用interrupt
	 * 报异常;中断状态将被清除
	 * @throws InterruptedException
	 * 
	 * wait(long time)//过time时间自动被唤醒
	 */
	public static void demo3() throws InterruptedException{
		Object obj = new Object();
		ThreadA ta = new ThreadA(obj);
		ta.start();
		Thread.sleep(1000);
		ta.interrupt();
//		NotifyThread nt = new NotifyThread(obj); 被唤醒
//		nt.setName("NotifyThread ");
//		nt.start();
	}
	
	/**
	 * notify()先于wait()执行
	 * @throws InterruptedException
	 */
	public static void demo4() throws InterruptedException{
		MyRun run = new MyRun();
		Thread b = new Thread(run.runb);
		b.start();
		Thread.sleep(100);
		Thread a = new Thread(run.runa);
		a.start();
		
//	    begin notify
//	    begin wait
	}

	/**
	 * wait条件发生变化
	 * @throws InterruptedException
	 */
	public static void demo5() throws InterruptedException {
		String lock = new String("");
		Add add = new Add(lock);
		Subtract sub = new Subtract(lock);
		ThreadSubtract subt = new ThreadSubtract(sub);
		subt.start();
		subt.setName("subt");
		ThreadSubtract subt2 = new ThreadSubtract(sub); 
		subt2.setName("subt2");
		subt2.start();
		Thread.sleep(1000);
		ThreadAdd addt = new ThreadAdd(add);
		addt.setName("addt");
		addt.start();
		
//		 wait begin ThreadName=subt
//		 wait begin ThreadName=subt2
//		 wait end ThreadName=subt2
//		 wait end ThreadName=subt
//		 list size= 0
//		 java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
	}
}
