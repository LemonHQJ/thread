package com.lem.thread.priority;

public class Main {

	public static void main(String[] args) {
//		demo1();
		demo2();
	}

	/**
	 * 线程优先级继承性
	 * 目的：测试线程继承优先性
	 * 结果：一致;未修改主线程优先级：5 5 5；修改主线程优先级为6： 6  6  6 ;A启动B;A与B优先级相同
	 */
	public static void demo1(){
		System.out.println(Thread.currentThread().getPriority());//5
		Thread.currentThread().setPriority(6);//6
		System.out.println(Thread.currentThread().getPriority());//6
		MyThread mt = new MyThread();//5  6
		mt.start();//5  6
	}
	
	/**
	 * 
	 * 优先级高的大部分会先执行完
	 */
	public static void demo2(){
		for (int i = 0; i < 10; i++) {
			MyThread3 mt1 = new MyThread3();
			mt1.setPriority(1);
			mt1.start();
			MyThread4 mt2 = new MyThread4();
			mt2.setPriority(10);
			mt2.start();
		}
	}
}
