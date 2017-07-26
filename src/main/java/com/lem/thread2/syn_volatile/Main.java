package com.lem.thread2.syn_volatile;


public class Main {

	
	public static void main(String[] args) throws InterruptedException{
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
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
	 * 不加vol永远运行
	 * volatile可见性
	 */
	public static void demo2() throws InterruptedException{
		RunThread rt = new RunThread();
		rt.start();
		Thread.sleep(50);
		rt.setIsRunning(false);
		System.out.println("已经被赋值");
	}
	
	/**
	 * volatile非原子性()
	 */
//	public static void demo3() throws InterruptedException{
//		MyThread[] mt = new MyThread[100];
//		for (int i = 0; i < mt.length; i++) {
//			mt[i] = new MyThread();
//		}
//		
//		for (int i = 0; i < mt.length; i++) {
//			mt[i].start();
//		}
//		
//		//count>100;
//		//加同步锁 count = 10000 synchronized资源同步
//		//
//	}
	
	/**
	 * 原子类操作
	 * 保证i++原子性(仅仅是i++;如果调用不是原子性，一样是不安全)
	 */
	public static void demo4(){
		AddService as = new AddService();
		Thread t1 = new Thread(as);
		Thread t2 = new Thread(as);
		Thread t3 = new Thread(as);
		Thread t4 = new Thread(as);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	
	/**
	 * 结果：永远运行
	 * @throws InterruptedException
	 */
	public static void demo5() throws InterruptedException{
		Service ser = new Service();
		MyThreadA ta = new MyThreadA(ser);
		MyThreadB tb = new MyThreadB(ser);
		ta.start();
		Thread.sleep(1000);
		tb.start();
	}
	
	
	/**
	 * syn代码块有volatile的同步功能
	 * 结果：停止
	 * @throws InterruptedException
	 */
	public static void demo5_() throws InterruptedException{
		Service ser = new Service();
		MyThreadA ta = new MyThreadA(ser);
		MyThreadB tb = new MyThreadB(ser);
		ta.start();
		Thread.sleep(1000);
		tb.start();
/*		syn将线程工作内存中的私有变量与公有内存中的变量同步的功能;    但是run中加sleep也是可以中断(猜：
		JVM对于现代的机器做了最大程度的优化，也就是说，最大程度的保障了线程和主存之间的及时的同步，也就是相当于虚拟机尽可能的帮我们加了个volatile
		，但是，当CPU被一直占用的时候，同步就会出现不及时，也就出现了后台线程一直不结束的情况;可能是sleep -->  CPU空闲	--> 同步
		)
*/		
		
	}
}
