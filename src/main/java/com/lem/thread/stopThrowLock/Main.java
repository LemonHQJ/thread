package com.lem.thread.stopThrowLock;

public class Main {
	public static void main(String[] args) {
		demo1();
//		demo2();
	}
	
	/**
	 * 目的：stop释放锁的不良后果
	 * 结果：b	aa
	 * stop释放锁将给数据造成不一致
	 */
	public static void demo1(){
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(5000);
			thread.stop();
			System.out.println(object.getUsername()+"	"+ object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ThreadDeath e){
			System.out.println("ThreadDeath");
		}
	}
	
	/**
	 * 问：在Mythread内部如果不catchThreadDeath；则不报错；cathc报错;则在main中stop不报错
	 */
	public static void demo2(){
		SynchronizedObject object = new SynchronizedObject();
		MyThread thread = new MyThread(object);
		thread.start();
		
	}
}
