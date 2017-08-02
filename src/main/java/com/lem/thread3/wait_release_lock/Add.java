package com.lem.thread3.wait_release_lock;

public class Add {

	
	private String lock;
	public Add(String lock){
		this.lock = lock;
	}
	
	public void add(){
		synchronized(lock){
			ValueObject.list.add("anyString");
			lock.notifyAll();
		}
	}
}
