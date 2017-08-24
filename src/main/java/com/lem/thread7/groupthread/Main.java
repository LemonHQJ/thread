package com.lem.thread7.groupthread;

public class Main {

	public static void main(String[] args) {
//		demo1();
		demo3();
	}
	
	/**
	 * 关联线程组：一级
	 * 父子
	 * 父对象有子对象，但是不创建子对象
	 */
	public static void demo1(){
		Thread t1 = new Thread(){
			@Override
			public void run() {
				try {
					while(!Thread.currentThread().isInterrupted()){
						System.out.println("begin "+Thread.currentThread().getName());
						Thread.sleep(10000);
						System.out.println("end "+ Thread.currentThread().getName());
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				try {
					while(!Thread.currentThread().isInterrupted()){
						System.out.println("begin "+Thread.currentThread().getName());
						Thread.sleep(10000);
						System.out.println("end "+ Thread.currentThread().getName());
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		ThreadGroup group = new ThreadGroup("新创建的线程组");
		Thread at = new Thread(group,t1);
		Thread bt = new Thread(group,t2);
		at.setName("at");
		bt.setName("bt");
		at.start();
		bt.start();
		System.out.println("活动的线程数为 " +group.activeCount());
		System.out.println("活动的线程数为 " +group.getName());
	}
	
	
	/**
	 * 关联线程组：多级关联
	 * 子孙
	 */
	public static void demo2(){
		
	}
	
	/**
	 * 线程自动归属特性
	 * 自动归到当前线程组中
	 */
	public static void demo3(){
		System.out.println("A处的线程 "+Thread.currentThread().getName() 
				+ " 所属的线程组名为       " 
				+ Thread.currentThread().getThreadGroup().getName()
				+ " 中有线程组的数量"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup group = new ThreadGroup("新的组");
		System.out.println("B处的线程 "+Thread.currentThread().getName() 
				+ " 所属的线程组名为       " 
				+ Thread.currentThread().getThreadGroup().getName()
				+ " 中有线程组的数量"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup[] groups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(groups);//enumerate将线程组中的子线程组以复制的形式拷贝到ThreadGroup[]
		for (int i = 0; i < groups.length; i++) {
			System.out.println("第一个线程组名称为： " + groups[i].getName());
		}
		
//		A处的线程 main 所属的线程组名为       main 中有线程组的数量0
//		B处的线程 main 所属的线程组名为       main 中有线程组的数量1
//		第一个线程组名称为： 新的组

	}
	
	
	
}
