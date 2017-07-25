package com.lem.thread2.syn_volatile;


public class Main {

	
	public static void main(String[] args) throws InterruptedException{
//		demo1();
		demo2();
	}
	

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public static void demo1() throws InterruptedException{
//		不继承runnable ：死循环
//		PrintString print = new PrintString();
//		print.printStringMethod();
//		print.setIsContinuePrint(false);
		PrintString print = new PrintString();
		new Thread(print,"thread").start();
		Thread.sleep(4000);
		print.setIsContinuePrint(false);
	}
	
	
	
	/**
	 * 
	 */
	public static void demo2() throws InterruptedException{
		RunThread rt = new RunThread();
		rt.start();
		Thread.sleep(50);
		rt.setIsRunning(false);
		System.out.println("已经被赋值");
	}
}
