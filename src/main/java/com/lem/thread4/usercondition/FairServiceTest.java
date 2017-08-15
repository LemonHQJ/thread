package com.lem.thread4.usercondition;

import java.util.concurrent.locks.ReentrantLock;

public class FairServiceTest {
	
	private ReentrantLock lock;

	public FairServiceTest(boolean isFair){
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try {
			this.lock.lock();
			System.out.println(Thread.currentThread().getName() + "获得锁定");
			Thread.sleep(300);
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
