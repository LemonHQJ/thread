package com.lem.thread4.reetrantreadwritelock;

public class Main {

	public static void main(String[] args) throws InterruptedException{
//		demo1();
//		demo2();
		demo3();
	}

	/**
	 * ReentrantReadWriteLock  
	 * 读读共享
	 */
	public static void demo1(){
		final MyService ms = new MyService();
		Runnable runa = new Runnable(){
			public void run() {
				ms.read();
			}
		};
		Thread ta = new Thread(runa);
		Thread tb = new Thread(runa);
		ta.start();
		tb.start();
		
//		read: begin 1502792921144
//		read: begin 1502792921144
//		read: end 1502792923145
//		read: end 1502792923145

	}
	
	/**
	 * ReentrantReadWriteLock  
	 * 写写互斥
	 */
	public static void demo2(){
		final MyService ms = new MyService();
		Runnable runa = new Runnable(){
			public void run() {
				ms.write();
			}
		};
		Thread ta = new Thread(runa);
		Thread tb = new Thread(runa);
		ta.start();
		tb.start();
		
//		write: begin 1502793309039
//		write: end 1502793311039
//		write: begin 1502793311040
//		write: end 1502793313041
	}
	
	
	/**
	 * ReentrantReadWriteLock  
	 * 读写互斥
	 */
	public static void demo3(){
		final MyService ms = new MyService();
		Runnable runa = new Runnable(){
			public void run() {
				ms.write();
			}
		};
		Runnable runb = new Runnable(){
			public void run() {
				ms.read();
			}
		};
		Thread ta = new Thread(runa);
		Thread tb = new Thread(runb);
		ta.start();
		tb.start();
		
//		read: begin 1502793419058
//		read: end 1502793429058
//		write: begin 1502793429058
//		write: end 1502793439059

	}
}