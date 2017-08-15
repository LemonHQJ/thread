package com.lem.thread4.reetrantreadwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;


public class MyService {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		try {
			lock.readLock().lock();
			System.out.println("read: begin " + System.currentTimeMillis());
			Thread.sleep(10000);
			System.out.println("read: end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
	
	
	public void write(){
		try {
			lock.writeLock().lock();
			System.out.println("write: begin " + System.currentTimeMillis());
			Thread.sleep(10000);
			System.out.println("write: end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
}
