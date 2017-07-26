package com.lem.thread2.syn_volatile;

public class RunThread extends Thread {

	
//	volatile private boolean isRunning = true;
	private boolean isRunning = true; /*存在于公共堆栈及线程的私有堆栈中；jvm -server模式时为了线程
									   运行效率，线程一直在私有堆栈中取得isRunning的值是true，代码setRunning(false)
									   虽被执行，更新的却是公共堆栈中的isRunning变量值false....
										*/
	public boolean returnIsRunning(){
		return isRunning;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("begin");
		while(isRunning){
		}
		System.out.println("end");
	}
	
	
	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
}
