package com.lem.thread2.syn_volatile;

public class RunThread extends Thread {

	
	private boolean isRunning = true;
	
	public boolean returnIsRunning(){
		return isRunning;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("begin");
		while(isRunning){
			System.out.println("run");
		}
		System.out.println("end");
	}
	
	
	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
}
