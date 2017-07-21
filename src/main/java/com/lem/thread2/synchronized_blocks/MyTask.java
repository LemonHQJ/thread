package com.lem.thread2.synchronized_blocks;

public class MyTask {

	public void doLongTimeTask(){
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("nosynchronized threadName=		"
					+ Thread.currentThread().getName() + "      i = " + (i+1));
		}
		
		System.out.println("");
		synchronized (this) {
			for (int i = 0; i < 1000; i++) {
				System.out.println("synchronized threadName=	"
						+ Thread.currentThread().getName() + "  i = " + (i+1));
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - beginTime));

	}
}
