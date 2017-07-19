package com.lem.thread.use_returnI_iterrupt;

public class Main {

	public static void main(String[] args) {
	}
	
	/**
	 * return停止线程
	 * 目的：测试用return停止线程
	 * 结果：无报错
	 * 做好还是抛异常，可以传递给上层
	 */
	public static void demo1(){
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(2000);
			t.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
