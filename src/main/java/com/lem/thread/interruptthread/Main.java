package com.lem.thread.interruptthread;

public class Main {

//	个人：并不存在main执行完再调用Thread.start,main是主线程，在其中创建一个thread并start()之后创建了一个子线程，cpu会分配时间片,交替执行	
	public static void main(String[] args) {
		demo1();
//		demo2();
	}
	
	public static void demo1(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(1);//  设置时间很长有可能:运行完run->Thread.currentThread().getName()->中断1 ->中断2
			mt.interrupt();
			System.out.println("是否中断1		" + mt.isInterrupted());//false ; 可能运行时间过短
			System.out.println("是否中断2		" + mt.interrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void demo2(){
		Thread.currentThread().interrupt();
		System.out.println("是否中断1		" + Thread.interrupted());
		System.out.println("是否中断2		" + Thread.interrupted());
	}

}
