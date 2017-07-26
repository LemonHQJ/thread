package com.lem.thread2.syn_volatile;

import java.util.concurrent.TimeUnit;

public class StopThread {
	 private static boolean stop = false;
	    
	    public static void main(String[] args) throws InterruptedException {
	        Thread t = new Thread(new Runnable(){
	            public void run() {
	                int i = 0;
	                while (!stop) {
//	                	System.out.println("i = "+i++);
	                }
	            }
	        });
	        t.start();
	        TimeUnit.SECONDS.sleep(1);
	        stop = true;
	    }
}
