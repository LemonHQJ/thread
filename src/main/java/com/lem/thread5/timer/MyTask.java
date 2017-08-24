package com.lem.thread5.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		try {
			System.out.println("task begin运行了，时间为 ： " + new Date());
			Thread.sleep(20000);
			System.out.println("task end运行了，时间为 ： " + new Date());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
