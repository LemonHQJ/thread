package com.lem.thread3.join_more_test;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		demo1();
	}
	
	public static void demo1() throws InterruptedException{
		ThreadB tb = new ThreadB();
		ThreadA ta = new ThreadA(tb);
		ta.start();
		tb.start();
		tb.join(2000);
		System.out.println(System.currentTimeMillis());
	}
	
	
}
