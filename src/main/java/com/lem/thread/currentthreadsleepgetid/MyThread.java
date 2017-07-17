package com.lem.thread.currentthreadsleepgetid;

public class MyThread extends Thread {
	
	private String name;
	
	public MyThread(){
//		System.out.println("构造方法打印当前线程" + Thread.currentThread().getName());
	}
	
	public MyThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("run		" + Thread.currentThread().getName());
		if("aa".equals(name)){
			System.out.println("run		" + this.isAlive());
		}
	}
}
