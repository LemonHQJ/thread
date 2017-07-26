package com.lem.thread.base;

public class Main {

	public static void main(String[] args) {
		//不共享数据
//		demo1();
		//共享数据
//		demo2();
		//共享数据
//		demo3();
//		共享同步
//		demo4();
		
		demo();
	}
	
	public static void demo(){
		Service s = new Service();
		MyThreadA mta = new MyThreadA(s);
		MyThreadB mtb = new MyThreadB(s);
		mta.start();
		mtb.start();
	}
	
	
	//不共享
	public static void demo1(){
		Runnable mr1 = new MyRunnable();
		Runnable mr2 = new MyRunnable();
		Runnable mr3 = new MyRunnable();
		new Thread(mr1,"my1").start();
		new Thread(mr2,"my2").start();
		new Thread(mr3,"my3").start();
		
		
	}
	//共享1
	public static void demo2(){
		Runnable mr1 = new MyRunnable();
		new Thread(mr1,"my1").start();
		new Thread(mr1,"my2").start();
		new Thread(mr1,"my3").start();
	}
	//共享2
	public static void demo3(){
		MyThread mt1 = new MyThread("mt1");
		new Thread(mt1).start();
		new Thread(mt1).start();
		new Thread(mt1).start();
		new Thread(mt1).start();
		new Thread(mt1).start();
	}
//	共享同步
	public static void demo4(){
		MyThread mt1 = new MyThread("mt1");
		new Thread(mt1).start();
		new Thread(mt1).start();
		new Thread(mt1).start();
		new Thread(mt1).start();
		new Thread(mt1).start();
	}
	
}
