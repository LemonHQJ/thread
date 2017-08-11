package com.lem.thread3.threadlocal;

import java.util.Date;

public class Main {

	
	//ThreadLocal 存线程存放的值
	public static ThreadLocal t1 = new ThreadLocal();
	
	public static void main(String[] args) throws InterruptedException{
//		demo1();
//		demo2();
		demo3();
	}
	
	public static void demo1(){
		System.out.println(t1.get());
		if(t1.get() == null){
			System.out.println("无值");
			t1.set("新值");
		}
		t1.set("11");
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
	
	public static void demo2(){
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
	}
	
	/**
	 * 值继承？？？？？？？？？？？？？？？？？？
	 * @throws InterruptedException
	 */
	public static void demo3() throws InterruptedException{
		MyThread mt = new MyThread();
		for (int i = 0; i < 10; i++) {
			 Tools.te1.set("Main ");
			Thread.sleep(100);
		}
		Thread.sleep(5000);
		mt.start();
	}
}