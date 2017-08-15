package com.lem.thread4.usercondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) throws InterruptedException{
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
//		demo6();
//		demo7();
//		demo8();
//		demo9();
//		demo10();
//		demo11();
		demo12();
	}

	/**
	 * Condition：await 等待
	 * @throws InterruptedException
	 */
	public static void demo1() throws InterruptedException{
		MyService ms = new MyService();
		MyThreadA a = new MyThreadA(ms);
		a.start();
	}
	
	/**
	 * Condition：await/signal
	 * @throws InterruptedException
	 */
	public static void demo2() throws InterruptedException{
		MyService ms = new MyService();
		MyThreadA a = new MyThreadA(ms);
		a.start();
		Thread.sleep(3000);
		ms.signal();
		
//		等待唤醒
//		await 时间为 1502453580698
//		signal 时间为 1502453583699
	}
	
	/**
	 * Condition：实现 等待/通知
	 * @throws InterruptedException
	 */
	public static void demo3() throws InterruptedException{
		MyService ms = new MyService();
		MyThreadA a = new MyThreadA(ms);
		a.start();
		MyThreadB b = new MyThreadB(ms);
		b.start();
		Thread.sleep(3000);
		ms.signalAll();
		
//		awaitA begin 1502617243636
//		awaitB begin 1502617243637
//		signal 时间为 1502617246637
//		awaitA end 1502617246637
//		awaitB end 1502617246637
	}
	
	/**
	 * Condition：实现部分通知
	 * @throws InterruptedException
	 */
	public static void demo4() throws InterruptedException{
		MyService ms = new MyService();
		MyThreadA a = new MyThreadA(ms);
		a.start();
		MyThreadB b = new MyThreadB(ms);
		b.start();
		Thread.sleep(3000);
		ms.signal_A();
//		awaitA begin 1502620296781
//		awaitB begin 1502620296781
//		signal 时间为 1502620299781
//		awaitA end 1502620299781

	}
	
	/**
	 * Condition：实现交替打印
	 * @throws InterruptedException
	 */
	public static void demo5() throws InterruptedException{
		MyService ms = new MyService();
		MyThreadA a = new MyThreadA(ms);
		a.start();
		MyThreadB b = new MyThreadB(ms);
		b.start();
	}
	
	/**
	 * 公平锁
	 * @throws InterruptedException
	 */
	public static void demo6() throws InterruptedException{
		final FairServiceTest ser = new FairServiceTest(true);
		Runnable run = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "正在运行 run" );
				ser.serviceMethod();
			}
		};
		Thread[] ta = new Thread[10];
		for (int i = 0; i < 10; i++) {
			ta[i] = new Thread(run);
			ta[i].setName("线程 "+i);
		}
		for (int i = 0; i < 10; i++) {
			ta[i].start();
		}
		
//		按照顺序
//		线程 1正在运行 run
//		线程 2正在运行 run
//		线程 6正在运行 run
//		线程 5正在运行 run
//		线程 4正在运行 run
//		线程 3正在运行 run
//		线程 0正在运行 run
//		线程 8正在运行 run
//		线程 9正在运行 run
//		线程 1获得锁定
//		线程 7正在运行 run
//		线程 2获得锁定
//		线程 6获得锁定
//		线程 5获得锁定
//		线程 4获得锁定
//		线程 3获得锁定
//		线程 0获得锁定
//		线程 8获得锁定
//		线程 9获得锁定
//		线程 7获得锁定

	}
	
	/**
	 * lock.getHoldCount()：当前调用lock()次数
	 *
	 */
	public static void demo7(){
		final MyService ms = new MyService();
		Runnable run = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "正在运行 run" );
				ms.serviceMethod1();
			}
		};
		Thread[] ta = new Thread[3];
		for (int i = 0; i < 3; i++) {
			ta[i] = new Thread(run);
			ta[i].setName("线程 "+i);
		}
		for (int i = 0; i < 3; i++) {
			ta[i].start();
		}
//		线程 0正在运行 run
//		线程 2正在运行 run
//		线程 1正在运行 run
//		线程 0serviceMethod1 count :1
//		线程 0serviceMethod1 count :2
//		线程 2serviceMethod1 count :1
//		线程 2serviceMethod1 count :2
//		线程 1serviceMethod1 count :1
//		线程 1serviceMethod1 count :2
	}
	
	/**
	 * 是否有线程等待获取此锁定
	 * hasQueuedThread(Thread thread)
	 * hasQueuedThreads()
	 * @throws InterruptedException
	 */
	public static void demo8() throws InterruptedException{
		final MyService ms = new MyService();
		Runnable run = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "正在运行 run" );
				ms.waitMethod1();
			}
		};
		
		Thread ta = new Thread(run);
		Thread tb = new Thread(run);
		ta.start();
		Thread.sleep(1000);
		tb.start();
		Thread.sleep(1000);
		System.out.println(ms.lock.hasQueuedThread(ta));
		System.out.println(ms.lock.hasQueuedThread(tb));
		System.out.println(ms.lock.hasQueuedThreads());
		
//		false
//		true
//		true

	}
	
	
	/**
	 * lock.hasWaiters(con)
	 * @throws InterruptedException
	 */
	public static void demo9() throws InterruptedException{
		final MyService ms = new MyService();
		Runnable run = new Runnable() {
			public void run() {
				ms.awit();
			}
		};
		Thread[] ta = new Thread[3];
		for (int i = 0; i < 3; i++) {
			ta[i] = new Thread(run);
			ta[i].setName("线程 "+i);
		}
		for (int i = 0; i < 3; i++) {
			ta[i].start();
		}
		Thread.sleep(2000);
		ms.notityMethod();
	}
	
	/**
	 * lock.tryLock
	 * @throws InterruptedException
	 */
	public static void demo10() throws InterruptedException{
		final MyService ms = new MyService();
		Runnable run = new Runnable(){
			public void run() {
				ms.tryLock("");
			}
		};
		Thread ta = new Thread(run);
		ta.setName("A");
		Thread tb = new Thread(run);
		tb.setName("B");
		ta.start();
		tb.start();
		
//		A没有获得该锁
//		B获得该锁
	}
	
	/**
	 * lock.awaitUntil()
	 * @throws InterruptedException
	 */
	public static void demo11() throws InterruptedException{
//		final MyService ms = new MyService();
//		Runnable run = new Runnable(){
//			public void run() {
//				ms.waitMethod2();
//			}
//		};
//		Thread ta = new Thread(run);
//		ta.start();
		
//		自动唤醒
//		wait begin: 1502777754015
//		wait end: 1502777764015
		
		
		final MyService ms = new MyService();
		Runnable run = new Runnable(){
			public void run() {
				ms.waitMethod2();
			}
		};
		Runnable notify = new Runnable(){
			public void run() {
				ms.notifyAwaitUnit();
			}
		};
		Thread ta = new Thread(run);
		ta.start();
		Thread.sleep(1000);
		Thread tb = new Thread(notify);
		tb.start();
		
//		线程在等待前被唤醒
//		wait begin: 1502778812397
//		notifyAwaitUnit begin: 1502778813374
//		notifyAwaitUnit end: 1502778813374
//		wait end: 1502778813374
	}
	
	volatile private static int nextPrintWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition ca = lock.newCondition();
	final private static Condition cb = lock.newCondition();
	final private static Condition cc = lock.newCondition();

	/**
	 * condition实现顺序
	 * @throws InterruptedException
	 */
	public static void demo12() throws InterruptedException{
		Thread ta = new Thread(){
			@Override
			public void run() {
					try {
						lock.lock();
						while(nextPrintWho !=1){
							ca.await();
						}
						for (int i = 0; i < 3; i++) {
							System.out.println("ThreadA " + (i+1));
						}
						nextPrintWho=2;
						cb.signalAll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						lock.unlock();
					}
				}
		};
		Thread tb = new Thread(){
			@Override
			public void run() {
					try {
						lock.lock();
						while(nextPrintWho !=2){
							cb.await();
						}
						for (int i = 0; i < 3; i++) {
							System.out.println("ThreadB " + (i+1));
						}
						nextPrintWho=3;
						cc.signalAll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						lock.unlock();
					}
				}
		};
		Thread tc = new Thread(){
			@Override
			public void run() {
					try {
						lock.lock();
						while(nextPrintWho !=3){
							cc.await();
						}
						for (int i = 0; i < 3; i++) {
							System.out.println("ThreadC " + (i+1));
						}
						nextPrintWho=3;
						ca.signalAll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						lock.unlock();
					}
				}
		};
		Thread[] aa = new Thread[5];
		Thread[] ba = new Thread[5];
		Thread[] ca = new Thread[5];
		for (int i = 0; i < 5; i++) {
			aa[i] = new Thread(ta);
			ba[i] = new Thread(tb);
			ca[i] = new Thread(tc);
			aa[i].start();
			ba[i].start();
			ca[i].start();
		}
	}
}
