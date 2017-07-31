package com.lem.thread3.two_trans_data;

import com.lem.thread3.MyList;

public class Main {
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo4();
		demo5();
	}

	public static void demo1() {
		MyList list = new MyList();
		MyThread mta = new MyThread(list);
		MyThreadB mtb = new MyThreadB(list);
		mta.start();
		mtb.start();
	}

	/**
	 * wait调用
	 * 报错：java.lang.IllegalMonitorStateException
	 * 原因是没有对象监视器;也就是没有同步加锁
	 */
	public static void demo2(){
		String str = new String();
		try {
			str.wait();
//			str.notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void demo3(){
		try {
			String lock = new String();
			synchronized (lock) {
				lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * wait,notify
	 */
	public static void demo4(){
		Object obj = new Object();
		MyThread1 mt = new MyThread1(obj);
		MyThread2 mt2 = new MyThread2(obj);
		mt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mt2.start();
	}
	
	
	/**
	 * 改demo1 为wait
	 */
	public static void demo5(){
		MyList list = new MyList();
		MyThread mta = new MyThread(list);
		MyThreadB mtb = new MyThreadB(list);
		mta.start();
		mtb.start();
	}
}
