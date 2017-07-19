package com.lem.thread.sleep_stop;

public class Main {

	public static void main(String[] args) {
//		demo1();
		demo2();
	}

	/**
	 * 沉睡停止
	 * 目的：如果线程在sleep()状态下停止线程
	 * 结果：进入run中catch:run中isInterrupted：false；在线程mt:sleep中interrupt
	 */
	public static void demo1(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(10000);
			mt.interrupt();
			System.out.println("main" + mt.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println(" main catch");
			e.printStackTrace();
		}
		System.out.println("main end");
	}
	
	/**
	 * 暴力停止
	 * 目的：stop停止
	 * 结果：运行到stop停止，不报错
	 * 慎用：强制停止可能使一些清理性的工作得不到完成；对锁定的对象进行了“解锁”导致数据得不到同步处理
	 */
	public static void demo2(){
		try {
			MyThread1 mt1 = new MyThread1();
			mt1.start();
			Thread.sleep(10000);
			mt1.stop();
		} catch (Exception e) {
		}
		
	}
}
