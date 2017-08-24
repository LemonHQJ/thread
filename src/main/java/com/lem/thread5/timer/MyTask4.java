package com.lem.thread5.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask4 extends TimerTask {

	
	@Override
	public void run() {
		try {
			System.out.println("Timer cancel Task4 " + new Date());
			Main.timer.cancel();
			System.out.println("Task4   end ： " + new Date());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
