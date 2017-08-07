package com.lem.thread3.t_t_d_pipedtest;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {

	private WriteData write;
	private PipedOutputStream out;
	
	public ThreadWrite(WriteData write,PipedOutputStream out){
		super();
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		super.run();
		write.writeMethod(out);
	}
}
