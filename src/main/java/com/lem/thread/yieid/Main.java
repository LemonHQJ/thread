package com.lem.thread.yieid;

public class Main {

	public static void main(String[] args) {
		demo1();
	}
	
	/**
	 * 目的：yield
	 * 结果：耗时
	 */
	public static void demo1(){
		MyThread mt = new MyThread();
		mt.start();
	}

}
