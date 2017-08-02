package com.lem.thread.interrupt_thread;

public class Main {

//	个人：并不存在main执行完再调用Thread.start,main是主线程，在其中创建一个thread并start()之后创建了一个子线程，cpu会分配时间片,交替执行	
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		demo4();
//		demo5();
	}
	
	
	public static void demo1(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(1);//  设置时间很长有可能:运行完run->Thread.currentThread().getName()->中断1 ->中断2
//			mt.interrupt();
//			System.out.println("是否中断1		" + mt.isInterrupted());//true  MyThread 对象是被中断
			System.out.println("是否中断1		" + mt.interrupted());//false ;  判断当前主线程
			System.out.println("是否中断2		" + mt.interrupted()); //
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void demo2(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(2000);//  设置时间很长有可能:运行完run->Thread.currentThread().getName()->中断1 ->中断2
//			System.out.println("是否中断1		" + mt.isInterrupted());//true  MyThread 对象是被中断
			Thread.currentThread().interrupt();//中断当前主线程
			System.out.println("是否中断1		" + mt.interrupted());// true ;判断当前主线程是否中断
			System.out.println("是否中断2		" + mt.interrupted()); //false; 第一次调用interrupted完后，也是这个方法清除状态
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * TODO
	 */
	public static void demo3(){
//		try {
//			MyThread mt = new MyThread();
//			mt.start();
//			Thread.sleep(3000);
//			mt.interrupt();
//			System.out.println("是否中断1		" + mt.isInterrupted());// demo1/2 	下false ;demo3下true   运行后不清除状态
//			System.out.println("是否中断2		" + mt.isInterrupted());// demo1/2     下false ;demo3下true
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
	
	public static void demo4(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(3000);
			mt.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * 异常停止
	 * 目的：测试中断后，是否继续运行for后的语句
	 * 结果：继续运行for后面的语句
	 */
	public static void demo5(){
		try {
			MyThread1 mt = new MyThread1();
			mt.start();
			Thread.sleep(3000);
			mt.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 异常停止
	 * 目的：测试run方法for抛出异常的运行顺序
	 * 结果：忽略throw后面的动作；进入catch
	 */
	public static void demo6(){
		try {
			MyThread1 mt = new MyThread1();
			mt.start();
			Thread.sleep(3000);
			mt.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
