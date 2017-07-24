package com.lem.thread2.syn_blocks_static;


public class Main {

	
	public static void main(String[] args) throws InterruptedException{
		demo1();
	}
	
	/**
	 * 静态同步锁与同步锁是
	 * 静态同步锁：Class 锁
	 * 同步锁：对象锁
	 */
	public static void demo1(){
		Service ser = new Service();
		MyThreadA a = new MyThreadA();	
		MyThreadB b = new MyThreadB();	
		MyThreadC c = new MyThreadC(ser);	
		a.setName("a");
		b.setName("b");
		c.setName("c");
		a.start();
		b.start();
		c.start();
		
//		结果 异步：锁不同
//		c  printC  begin1500887623900
//		a  printA  begin1500887623900
//		a  printA   end1500887624902
//		b  printB  begin1500887624904
//		c  printC   end1500887624905
//		b  printB   end1500887625911
		
//		synchronized XXX static	与synchronized(XX.class)相同

	}

	
	/**
	 * String的常量池特性
	 */
	public static void demo2(){
		
	}
}
