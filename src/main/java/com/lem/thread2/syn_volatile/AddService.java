package com.lem.thread2.syn_volatile;

import java.util.concurrent.atomic.AtomicInteger;

public class AddService extends Thread {
	private AtomicInteger count = new AtomicInteger(0);
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 100; i++) {
			count.incrementAndGet();
		}
	}

}
