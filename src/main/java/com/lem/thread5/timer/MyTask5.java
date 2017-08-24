package com.lem.thread5.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask5 extends TimerTask {

	
	static int runCount = 0;
	
	@Override
	public void run() {
		try {
			System.out.println("MyTask5    begin " + new Date());
//			demo9
//			Thread.sleep(1000);
//			demo10
//			Thread.sleep(5000);
			System.out.println("MyTask5    end  " + new Date());
			runCount++;
			if(runCount == 5){
				Main.timer.cancel();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
