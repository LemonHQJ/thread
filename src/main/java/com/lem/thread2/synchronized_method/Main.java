package com.lem.thread2.synchronized_method;

public class Main {

	public static void main(String[] args) {
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
	 * 
	 */
	public static void demo2(){
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

	
}
