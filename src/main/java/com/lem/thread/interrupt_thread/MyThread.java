package com.lem.thread.interrupt_thread;

public class MyThread extends Thread{
//	private boolean stop =false;
	
//	demo1/2
//	@Override
//	public void run() {
//		for(int i=0;i<50000;i++){
//			System.out.println("i= " + (i+1));
//		}
//	}
	
//	demo3
//	public void run() { 
//        while(!stop){ 
//            System.out.println( "My Thread is running..." ); 
//            // 让该循环持续一段时间，使上面的话打印次数少点 
//            long time = System.currentTimeMillis(); 
//            while((System.currentTimeMillis()-time < 1000)) { 
//            } 
//        } 
//        System.out.println("My Thread exiting under request..." ); 
//    } 
	
//	demo4
	@Override
	public void run() {
		for(int i=0;i<500000;i++){
			if(this.interrupted()){//	isInterrupted可能会报错
				System.out.println("已经中断状态--------我要退出");
				break;
			}
			System.out.println("i= " + (i+1));
		}
	}
}
