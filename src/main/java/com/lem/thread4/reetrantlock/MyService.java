package com.lem.thread4.reetrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class MyService {

	private Lock lock = new ReentrantLock();
	
	public void testMethod(){
		lock.lock();
		for (int i = 0; i < 2; i++) {
			System.out.println("ThreadName = " + Thread.currentThread().getName() + " " + (i+1));
		}
		lock.unlock();
	}
	
	public void methodA(){
		try {
			lock.lock();
			System.out.println("methodA begin " + Thread.currentThread().getName() +"  "+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodA end " + Thread.currentThread().getName() +"  "+ System.currentTimeMillis());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void methodB(){
		try {
			lock.lock();
			System.out.println("methodB begin " + Thread.currentThread().getName() +"  "+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("methodB end " + Thread.currentThread().getName() +"  "+ System.currentTimeMillis());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
