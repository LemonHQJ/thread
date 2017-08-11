package com.lem.thread3.join;

public class Main {

	public static void main(String[] args) throws InterruptedException{
//		demo2();
//		demo3();
//		demo4();
		demo5();
	}
	
	public static void demo1(){
		MyThread mt = new MyThread();
		mt.start();
//		Thread.sleep(?);
		System.out.println("想即mt之后执行，但是sleep值不确定");
	}
	
	/**
	 * join作用：等待线程对象销毁
	 * @throws InterruptedException
	 */
	public static void demo2() throws InterruptedException{
		MyThread mt = new MyThread();
		mt.start();
		mt.join();
		System.out.println("等待mt运行完运行");
	}
	
	/**
	 * join()与interrupt():彼此遇到会出现异常；ThreadA还是会继续运行
	 * @throws InterruptedException
	 */
	public static void demo3() throws InterruptedException{
		ThreadB tb = new ThreadB();
		tb.start();
		Thread.sleep(10000);
		ThreadC tc = new ThreadC(tb);
		tc.start();
	}
	
	/**
	 * join与sleep 区别
	 * join:内部是wait
	 * @throws InterruptedException
	 */
	public static void demo4() throws InterruptedException{
		MyThread mt = new MyThread();
		mt.start();
//		mt.join(5000);//只等5s
//		Thread.sleep(5000);//也是等5s
		System.out.println("main " + System.currentTimeMillis());
//		
		
//		Mt   1502345807226
//		main 1502345812226
//		Mt   1502345817226
	}
	
	
	/**
	 * sleep() 不释放锁？？？？？？？？？？？？？？？？
	 * @throws InterruptedException
	 */
	public static void demo5() throws InterruptedException{
		Service ser = new Service();
		ThreadD td = new ThreadD(ser);
		ThreadE te = new ThreadE(ser);
		td.start();
		Thread.sleep(1000);
		te.start();
	}
	
}
