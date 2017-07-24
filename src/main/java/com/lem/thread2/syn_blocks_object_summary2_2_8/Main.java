package com.lem.thread2.syn_blocks_object_summary2_2_8;

public class Main {

	
	public static void main(String[] args) throws InterruptedException{
		demo2();
	}

	
	
	/**
	 * 当多个线程同事执行synchronized(x){}同步代码块时呈现同步效果
	 */
	
	/**
	 * 当其他线程执行x对象中的synchronized同步方法时呈现同步效果
	 * @throws InterruptedException 
	 */
	public static void demo2() throws InterruptedException{
		Service ser = new Service();
		MyObject mo = new MyObject();
		MyThread mt = new MyThread(ser, mo);
		MyThread1 mt1 = new MyThread1(mo);
		mt.setName("A");
		mt.start();
		Thread.sleep(5000);
		mt1.setName("B");
		mt1.start();
		
//		A  begin  testMethod
//		A    print
//		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		A    print
//		A  end  testMethod
//		B    print
//		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		B    print

	}
	
	/**
	 * 当其他线程执行x对象方法里的synchronized(this)代码块时呈现同步效果
	 */
}
