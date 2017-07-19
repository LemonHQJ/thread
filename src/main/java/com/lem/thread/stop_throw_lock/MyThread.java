package com.lem.thread.stop_throw_lock;

public class MyThread extends Thread {
	private SynchronizedObject object;
	public MyThread(SynchronizedObject object){
		this.object= object;
	}
	
//	demo1
	@Override
	public void run() {
		super.run();
		object.print("b", "bb");
	}
	
//	demo2
//	@SuppressWarnings("deprecation")
//	@Override
//	public void run() {
//		super.run();
//		try {
//			this.stop();
//		} catch (ThreadDeath e) {
//			System.out.println("进入catch");
//			e.printStackTrace();
//		}
//	}
}
