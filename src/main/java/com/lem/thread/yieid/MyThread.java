package com.lem.thread.yieid;

public class MyThread extends Thread {

	@Override
	public void run() {
		super.run();
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0;i<500000;i++){
			Thread.yield();
			count = count +i;
//			System.out.println(count); 注释掉，耗时短，放开耗时增长：System.out.println将对象结果输出到控制台，会花费大量的CPU资源（猜）
		}
		long endTime = System.currentTimeMillis();
		System.out.println(" 用时 ： " + (endTime-beginTime) + "毫秒");
	}
}
