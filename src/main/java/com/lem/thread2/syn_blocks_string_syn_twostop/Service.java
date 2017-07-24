package com.lem.thread2.syn_blocks_string_syn_twostop;

public class Service {

	
	public static void print(String str){
		synchronized (str) {
			while(true){
				System.out.println(Thread.currentThread().getName()  + "  printA  begin"+System.currentTimeMillis());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()  + "  printA   end"+System.currentTimeMillis());
			}
		}
	}
	
	synchronized public void methodA(){
		System.out.println("methodA begin");
		boolean isContinueRun = true;
		while(isContinueRun){
			System.out.println("while");
		}
		System.out.println("methodA end");
	}
	
	synchronized public void methodB(){
		System.out.println("methodB   begin");
		System.out.println("methodB   end");
	}
	
	
}
