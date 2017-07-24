package com.lem.thread2.syn_blocks_string_syn_twostop;


public class Main {

	
	public static void main(String[] args) throws InterruptedException{
//		demo1();
		demo2();
	}
	

	
	/**
	 * String的常量池特性
	 */
	public static void demo1(){
		MyThreadA mta = new MyThreadA();
		MyThreadB mtb = new MyThreadB();
		mta.setName("mta");
		mtb.setName("mtb");
		mtb.start();
		mta.start();
//		永远是线程mta
	}
	
	/**
	 * 无限循环
	 */
	public static void demo2(){
		Service ser = new Service();
		MyThread1 mt = new MyThread1(ser);
		MyThread2 mt2 = new MyThread2(ser);
		mt.setName("mt");
		mt2.setName("mt2");
		mt.start();
		mt2.start();
	}
	

	/**
	 * 死锁
	 * @throws InterruptedException
	 */
	public static void demo3() throws InterruptedException{
		DealThread dt = new DealThread();
		dt.setFlag("a");
		new Thread(dt).start();
		Thread.sleep(100);
		dt.setFlag("b");
		new Thread(dt).start();
	}

}
