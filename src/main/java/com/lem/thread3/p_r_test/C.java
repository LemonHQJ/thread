
package com.lem.thread3.p_r_test;

public class C {

	private String lock;
	
	public C(String lock){
		this.lock = lock;
	}
	
	public void getValue(){
		try {
			synchronized (lock) {
				if("".equals(ValueObject.value)){
					lock.wait();
				}
				System.out.println("get值 = "+ValueObject.value );
				ValueObject.value = "";
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
