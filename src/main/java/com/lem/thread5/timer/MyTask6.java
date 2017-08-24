package com.lem.thread5.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask6 extends TimerTask {

	@Override
	public void run() {
		try {
			System.out.println("task6 begin运行了，时间为 ： " + new Date());
			System.out.println("task6 end运行了，时间为 ： " + new Date());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
