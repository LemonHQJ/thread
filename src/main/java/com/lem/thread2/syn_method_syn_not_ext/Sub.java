package com.lem.thread2.syn_method_syn_not_ext;

public class Sub extends FF {

	 public void serviceMethod(){
		try {
			System.out.println("Sub 下一步 sleep begin threadName=  "
					+ Thread.currentThread().getName() + "   time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("Sub 下一步 sleep end threadName=    "
					+ Thread.currentThread().getName() + "   time="
					+ System.currentTimeMillis());
			this.serviceFMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
