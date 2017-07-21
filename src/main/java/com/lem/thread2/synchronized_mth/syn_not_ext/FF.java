package com.lem.thread2.synchronized_mth.syn_not_ext;

public class FF {

	synchronized public void serviceFMethod(){
		try {
			System.out.println(" main 下一步 sleep begin threadName =    "
					+ Thread.currentThread().getName() + "   time="
					+ System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println(" main 下一步 sleep end threadName =      "
					+ Thread.currentThread().getName() + "   time="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
