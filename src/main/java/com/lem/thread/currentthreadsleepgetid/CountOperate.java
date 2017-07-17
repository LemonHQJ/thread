package com.lem.thread.currentthreadsleepgetid;

public class CountOperate extends Thread {

	public CountOperate(){
		System.out.println("CountOperate---------------begin");
		System.out.println("Thread.currentThread.getName: " + Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive: " + Thread.currentThread().isAlive());
		System.out.println("this.getName(): " + this.getName());
		System.out.println("this.isAlive: " + this.isAlive());
		System.out.println("CountOperate---------------begin");
	}
	@Override
	public void run() {
		super.run();
		System.out.println("run---------------begin");
		System.out.println("Thread.currentThread.getName: " + Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive: " + Thread.currentThread().isAlive());
		System.out.println("this.getName(): " + this.getName());
		System.out.println("this.isAlive: " + this.isAlive());//this 对象实例
		System.out.println("run---------------begin");
		
	}
}
