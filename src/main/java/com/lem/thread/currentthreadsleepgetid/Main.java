package com.lem.thread.currentthreadsleepgetid;

public class Main {
	
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		isAlive
//		demo5();
		demo6();
	}
	
	public static void demo1(){
		MyThread mt = new MyThread();
		mt.start();
		mt.run();
	}
	
	public static void demo2(){
		CountOperate co = new CountOperate();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		new Thread(co,"lala").start();
		co.start();
	}
	
//	isAlive
	public static void demo3(){
		MyThread mt = new MyThread("aa");
		System.out.println("begin    isAlive" + mt.isAlive());//begin    isAlivefalse
		mt.start();
		System.out.println("after    isAlive" + mt.isAlive());//after    isAlivetrue
	}
	
	public static void demo4(){
		MyThread mt = new MyThread("aa");
		System.out.println("begin    isAlive" + mt.isAlive());//begin    isAlivefalse
		mt.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after    isAlive" + mt.isAlive());//after    isAlivefalse
	}
	
	public static void demo5(){
		CountOperate co = new CountOperate();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		new Thread(co).start();
	}
	
	public static void demo6(){
		MyThread1 mt1 = new MyThread1();
		System.out.println("begin= " + System.currentTimeMillis());
//		mt1.start();
		new Thread(mt1,"äa").start();
		System.out.println("end= " + System.currentTimeMillis());

	}
	
//	getId
	public static void demo7(){
		Thread  runThread = Thread.currentThread();
		runThread.getId();
	}
}
