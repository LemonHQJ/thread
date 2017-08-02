package com.lem.thread3.wait_release_lock;

public class ThreadSubtract extends Thread {

	private Subtract r;
	
	public ThreadSubtract(Subtract r){
		this.r = r;
	}
	
	@Override
	public void run() {
		super.run();
		r.subtrack();
	}
}
