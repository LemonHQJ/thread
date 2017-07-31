package com.lem.thread3.two_trans_data;

public class MyThread1 extends Thread {

	
	private Object obj;
	
	public MyThread1(Object obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			synchronized (obj) {
				System.out.println("进入Thread" + System.currentTimeMillis());
				obj.wait();
				System.out.println("等完了！！！！！！！！！！！哈哈" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
