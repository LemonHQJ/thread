package com.lem.thread2.synchronized_method;

public class Main {

	public static void main(String[] args) {
//		demo2();
//		demo3();
		demo4();
	}
	
	
	/**
	 * 目的：测试私有变量是否安全
	 * 结果：安全；(猜：同一个方法，不同私有变量)
	 */
	public static void demo1(){
		HasSelfPrvateNum hs = new HasSelfPrvateNum();
		MyThread mt = new MyThread(hs,"a");
		MyThread mt1 = new MyThread(hs,"b");
		mt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mt1.start();
		mt.stop();
	}
	
	/**
	 * 目的：测试实例变量是否安全
	 * 结果：线程不安全
	 */
	public static void demo2(){
		HasSelfPrvateNum1 hs = new HasSelfPrvateNum1();
		MyThread mt = new MyThread(hs);
		MyThread1 mt1 = new MyThread1(hs);
		MyThread1 mt2 = new MyThread1(hs);
		MyThread mt3 = new MyThread(hs);
		mt.start();
		mt1.start();
		mt2.start();
		mt3.start();
//		b set over
//		b set over
//		a set over
//		a set over
//		username= b  num: 100
//		username= b  num: 100
//		username= a  num: 100
//		username= a  num: 100

	}

	/**
	 * 目的：测试synchronized是否是线程安全 
	 * 
	 */
	public static void demo3(){
		HasSelfPrvateNum2 hs = new HasSelfPrvateNum2();
		MyThread mt = new MyThread(hs);
		MyThread1 mt1 = new MyThread1(hs);
		MyThread1 mt2 = new MyThread1(hs);
		MyThread mt3 = new MyThread(hs);
		mt.start();
		mt1.start();
		mt2.start();
		mt3.start();
	}
	
	/**
	 * 目的：多个对象多个锁
	 */
	public static void demo4(){
		HasSelfPrvateNum2 hsp = new HasSelfPrvateNum2();
		HasSelfPrvateNum2 hsp1 = new HasSelfPrvateNum2();
		MyThread mt = new MyThread(hsp);
		MyThread1 mt1 = new MyThread1(hsp1);
		mt.start();
		mt1.start();
	}
}
