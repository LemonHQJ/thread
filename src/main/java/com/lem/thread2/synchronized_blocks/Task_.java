package com.lem.thread2.synchronized_blocks;

public class Task_ {

	private String getData1 ;
	private String getData2 ;
	
	public void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			String getData1_ = "长时间处理任务后从远程返回的值1 threadName= "
						+ Thread.currentThread().getName();
			String getData2_ = "长时间处理任务后从远程返回的值2 threadName= "
					+ Thread.currentThread().getName();
			synchronized (this) {
				getData1 = getData1_;
				getData2 = getData2_;
				Thread.sleep(3000);
				System.out.println("synchronized   " + Thread.currentThread().getName());
			}
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
			
		} catch (InterruptedException e) {
			
		}
	}
}
