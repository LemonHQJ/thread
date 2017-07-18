package com.lem.thread.suspend_resume;

public class Main {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
		demo5();
	}
	
	/**
	 * 目的： 暂停线程
	 * 结果：确实暂停，可以恢复运行状态
	 */
	public static void demo1(){
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5000);
//			A 段
			thread.suspend();
			System.out.println("A= "+ System.currentTimeMillis() + "	i="+ thread.getI());
			Thread.sleep(5000);
			System.out.println("A= "+ System.currentTimeMillis() + "	i="+ thread.getI());
			System.out.println();
//			B 段
			thread.resume();
			System.out.println("B= "+ System.currentTimeMillis() + "	i="+ thread.getI());
			System.out.println();
//			C 段
			thread.suspend();
			System.out.println("C= "+ System.currentTimeMillis() + "	i="+ thread.getI());
			Thread.sleep(5000);
			System.out.println("C= "+ System.currentTimeMillis() + "	i="+ thread.getI());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 目的： 测试suspend缺点
	 * 结果：只打印一个"begin"
	 * 没有resume，会一直占用;独占
	 */
	public static void demo2(){
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread = new Thread(){
				@Override
				public void run(){
					object.printString();
				}
			};
			thread.setName("a");
			thread.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread(){
				@Override
				public void run() {
					super.run();
					System.out.println("thread2 启动了，但进入不了printString()方法！只能打印一个begin");
					System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停！！");
					object.printString();
				}
			};
//			thread.resume();
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
//	/**
//	 * 目的： 测试suspend缺点1
//	 * 结果：直接打印main end
//	 */
//	public static void demo3(){
//		try {
//			MyThread mt = new MyThread();
//			mt.start();
//			Thread.sleep(1000);
//			mt.suspend();
//			System.out.println("main end");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	/**
	 * 目的： 测试suspend缺点2
	 * 结果：一直打印数字，不出现"main end"( 问：i一直增长，到达某个数值后不再增长且数值不固定，随后卡死在一个数值，不再增长  ；自猜：print内部没有释放 )
	 * 不出现"main end"：运行到println()方法内部停止时；同步锁未被释放；导致一直呈现"暂停"状态，并且锁未释放，main方法中的代码println；不能打印
	 */
	public static void demo4(){
		try {
			MyThread mt = new MyThread();
			mt.start();
			Thread.sleep(1000);
			mt.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 目的： 测试suspend缺点3
	 * 结果：停止a线程！！！！
	 *		a     11
	 * 值不同步
	 */
	public static void demo5(){
		try {
			final MyObject mo = new MyObject();
			Thread thread = new Thread(){
				@Override
				public void run(){
					mo.setValue("a", "aa");
				};
			};
			thread.setName("a");
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			Thread thread2 = new Thread(){
				@Override
				public void run(){
					mo.print();
				};
			};
			thread2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
