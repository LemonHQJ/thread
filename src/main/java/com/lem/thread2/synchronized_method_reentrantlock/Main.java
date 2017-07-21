package com.lem.thread2.synchronized_method_reentrantlock;

public class Main {

	public static void main(String[] args) {
//		demo1();
		demo2();
	}
	
	
	/**
	 * 目的：锁重入
	 * synchroinzied内部调用本类的其他synchroinzied方法，依旧可以得到锁
	 */
	public static void demo1(){
		Service ser = new Service();
		MyThread mt = new MyThread(ser);
		mt.run();
	}
	
	/**
	 * 可重入锁：可用于父子关系
	 * 自己可以再次获得自己内部锁
	 */
	public static void demo2(){
		SS sub = new SS();
		MyThread1 mt = new MyThread1(sub);
		mt.start();
	}
}
