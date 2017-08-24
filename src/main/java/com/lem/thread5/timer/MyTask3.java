package com.lem.thread5.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask3 extends TimerTask {

	@Override
	public void run() {
		try {
			System.out.println("取消 task3   运行了时间为 ： " + new Date());
			this.cancel();
			System.out.println("task3   end ： " + new Date());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
