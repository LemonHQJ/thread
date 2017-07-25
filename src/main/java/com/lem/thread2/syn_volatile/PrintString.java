package com.lem.thread2.syn_volatile;

public class PrintString implements Runnable{
	private boolean isContinuePrint = true;
	
	public boolean returnIsContinuePrint(){
		return isContinuePrint;
	}
	
	public void printStringMethod(){
		System.out.println(Thread.currentThread().getName() + "  begin");
		while(isContinuePrint){
			System.out.println(Thread.currentThread().getName() + " run ");
		}
		System.out.println(Thread.currentThread().getName() + "   end");
	}

	public void run() {
		System.out.println("run");
		printStringMethod();
	}

	public void setIsContinuePrint(boolean isContinuePrint){
		this.isContinuePrint = isContinuePrint;
	}
}
