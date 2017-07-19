package com.lem.thread.interrupt_thread;

public class MyThread1 extends Thread{
	
//  demo5
//	@Override
//	public void run() {
//		super.run();
//		for(int i=0;i<500000;i++){
//			if(this.interrupted()){//	isInterrupted可能会报错
//				System.out.println("已经中断状态--------我要退出");
//				break;
//			}
//			System.out.println("i= " + (i+1));
//		}
//		System.out.println("又开始运行-----------------------");
//	}
	
	
//	demo6
	@Override
	public void run() {
		super.run();
		try {
			for(int i=0;i<500000;i++){
				if(this.interrupted()){//	isInterrupted可能会报错
					System.out.println("已经中断状态--------我要退出");
					throw new Exception();
				}
				System.out.println("i= " + (i+1));
			}
			System.out.println("又开始运行-----------------------");
		} catch (Exception e) {
			System.out.println("MyThread1.run 中catch方法");
			e.printStackTrace();
		}
		
	}

}
