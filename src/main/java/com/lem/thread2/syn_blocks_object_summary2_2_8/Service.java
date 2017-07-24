package com.lem.thread2.syn_blocks_object_summary2_2_8;

public class Service {

	public void testMethod(MyObject mo){
		System.out.println(Thread.currentThread().getName() + "  begin  testMethod");
		try {
			Thread.sleep(5000);
			mo.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "  end  testMethod");
	}
	
}
