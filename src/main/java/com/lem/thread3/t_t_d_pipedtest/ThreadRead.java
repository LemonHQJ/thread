package com.lem.thread3.t_t_d_pipedtest;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadRead extends Thread {

	private ReadData read;
	private PipedInputStream input;
	
	
	public ThreadRead(ReadData read,PipedInputStream input){
		super();
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		super.run();
		read.readMethod(input);
	}
}
