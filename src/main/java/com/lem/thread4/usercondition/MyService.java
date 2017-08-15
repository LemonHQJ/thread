package com.lem.thread4.usercondition;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	
	private Condition con = lock.newCondition();
	
	private Condition cona = lock.newCondition();
	
	private Condition conb = lock.newCondition();
	
	private boolean flag = true;
	
	public void waitMethod(){
		try {
			lock.lock();
			System.out.println("A");
			con.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("释放锁");
		}
	}
	
	public void awit(){
		try {
			lock.lock();
			System.out.println("await 时间为 " + System.currentTimeMillis());
			con.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void awaitA(){
		try {
			lock.lock();
			System.out.println("awaitA begin " + System.currentTimeMillis());
			con.await();
			System.out.println("awaitA end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void awaitB(){
		try {
			lock.lock();
			System.out.println("awaitB begin " + System.currentTimeMillis());
			con.await();
			System.out.println("awaitB end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal(){
		try {
			lock.lock();
			System.out.println("signal 时间为 " + System.currentTimeMillis());
			con.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signalAll(){
		try {
			lock.lock();
			System.out.println("signal 时间为 " + System.currentTimeMillis());
			con.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
/*************************************************demo4*********************************************************************/
	public void await_A(){
		try {
			lock.lock();
			System.out.println("awaitA begin " + System.currentTimeMillis());
			cona.await();
			System.out.println("awaitA end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void await_B(){
		try {
			lock.lock();
			System.out.println("awaitB begin " + System.currentTimeMillis());
			conb.await();
			System.out.println("awaitB end " + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal_A(){
		try {
			lock.lock();
			System.out.println("signal_A 时间为 " + System.currentTimeMillis());
			cona.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal_B(){
		try {
			lock.lock();
			System.out.println("signal_B 时间为 " + System.currentTimeMillis());
			conb.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
/*************************************************demo5*******************交替打印**************************************************/	
	
	public void set(){
		try {
			lock.lock();
			while(flag){
				con.await();
			}
			flag = true;
			System.out.println("*");
			Thread.sleep(100);
			con.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void get(){
		try {
			lock.lock();
			while(!flag){
				con.await();
			}
			flag = false;
			System.out.println("#");
			Thread.sleep(100);
			con.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
/************************************************************getHoldCount************************************************************/
	public void serviceMethod1(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "serviceMethod1 count :"+lock.getHoldCount());
			Thread.sleep(200);
			serviceMethod2();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void serviceMethod2(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "serviceMethod1 count :"+lock.getHoldCount());
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

/************************************************************getHoldCount************************************************************/

	public void waitMethod1(){
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(Integer.MAX_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}

/************************************************************hasWaiters************************************************************/
	public void notityMethod(){
		try {
			lock.lock();
			System.out.println("有没有线程等待condition? " + lock.hasWaiters(con) +" 线程数是多少 ？ "+lock.getWaitQueueLength(con));
			con.signal();
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
	
	
/************************************************************tryLock************************************************************/
	public void tryLock(String str){
		if("time".equals(str)){
			try {
				if(lock.tryLock(3,TimeUnit.SECONDS)){
					System.out.println(Thread.currentThread().getName() + "获得该锁");
				}else {
					System.out.println(Thread.currentThread().getName() + "没有获得该锁");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			if(lock.tryLock()){
				System.out.println(Thread.currentThread().getName() + "获得该锁");
			}else {
				System.out.println(Thread.currentThread().getName() + "没有获得该锁");
			}	
		}
		
	}

	
/************************************************************awaitUnit************************************************************/
	public void waitMethod2(){
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("wait begin: " + System.currentTimeMillis());
			con.awaitUntil(calendar.getTime());
			System.out.println("wait end: " + System.currentTimeMillis());
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
	
	public void notifyAwaitUnit(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 10);
		lock.lock();
		System.out.println("notifyAwaitUnit begin: " + System.currentTimeMillis());
		con.signalAll();
		System.out.println("notifyAwaitUnit end: " + System.currentTimeMillis());
		lock.unlock();
	}

}
