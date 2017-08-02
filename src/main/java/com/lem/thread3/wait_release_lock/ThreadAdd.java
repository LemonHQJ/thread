package com.lem.thread3.wait_release_lock;

public class ThreadAdd extends Thread {

	private Add p;
	
	public ThreadAdd(Add p){
		super();
		this.p = p;
	}
	
	public void run(){
		p.add();
	}
}
