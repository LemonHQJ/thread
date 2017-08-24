package com.lem.thread5.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask2 extends TimerTask {

	static int i=0;
	
	@Override
	public void run() {
		try {
			System.out.println("task2 begin运行了，时间为 ： " + new Date());
//			demo8
//			System.out.println("正常执行了 " + i);
//			demo11
			Thread.sleep(2000);
			System.out.println("task2 end运行了，时间为 ： " + new Date());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
