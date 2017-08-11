package com.lem.thread3.threadlocal;

public class Main {

	public static ThreadLocal t1 = new ThreadLocal();
	
	public static void main(String[] args) throws InterruptedException{
		demo1();
		demo2();
	}
	
	public static void demo1(){
		System.out.println(t1.get());
		if(t1.get() == null){
			System.out.println("无值");
			t1.set("新值");
		}
		t1.set("11");
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
	
	public static void demo2(){
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
	}
}