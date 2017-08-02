package com.lem.thread3.wait_release_lock;

public class Subtract {

	private String lock;
	
	public Subtract(String lock){
		this.lock = lock;
	}
	
	public void subtrack(){
		try {
			synchronized (lock) {
				if(ValueObject.list.size()==0){  //可以改成while(list.size == 0)
					System.out.println(" wait begin ThreadName=" + Thread.currentThread().getName());
					lock.wait();
					System.out.println(" wait end ThreadName=" + Thread.currentThread().getName());
				}
			}
			ValueObject.list.remove(0);
			System.out.println("list size= "+ ValueObject.list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
