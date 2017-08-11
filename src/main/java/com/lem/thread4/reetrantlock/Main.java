package com.lem.thread4.reetrantlock;

public class Main {

	public static void main(String[] args) throws InterruptedException{
//		demo1();
		demo2();
	}

	/**
	 * ReentrantLock 1
	 * 同步，线程之间打印顺序是随机
	 */
	public static void demo1(){
		MyService ms = new MyService();
		ThreadA ta1 = new ThreadA(ms);
		ThreadA ta2 = new ThreadA(ms);
		ThreadA ta3 = new ThreadA(ms);
		ta1.setName("A");
		ta2.setName("B");
		ta3.setName("C");
		ta1.start();
		ta2.start();
		ta3.start();
//		ThreadName = A 1
//		ThreadName = A 2
//		ThreadName = C 1
//		ThreadName = C 2
//		ThreadName = B 1
//		ThreadName = B 2
	}
	
	/**
	 * ReentrantLock 2
	 * @throws InterruptedException
	 */
	public static void demo2() throws InterruptedException{
		MyService ms = new MyService();
		MyThreadA mta = new MyThreadA(ms);
		mta.setName("mta");
		MyThreadAA mtaa = new MyThreadAA(ms);
		mtaa.setName("mtaa");
		mta.start();
		mtaa.start();
		Thread.sleep(1000);
		MyThreadB mtb = new MyThreadB(ms);
		mtb.setName("mtb");
		MyThreadBB mtbb = new MyThreadBB(ms);
		mtbb.setName("mtbb");
		mtb.start();
		mtbb.start();
	}
	
	/**
	 * Condition实现 等待/通知
	 * @throws InterruptedException
	 */
	public static void demo3() throws InterruptedException{
		
	}
}
