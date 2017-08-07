package com.lem.thread3.t_t_d_pipedtest;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
	public static void main(String[] args) {
		demo1();
	}

	public static void demo1() {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			PipedInputStream input = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream();
			input.connect(out);
//			out.connect(input);
			ThreadRead threadRead = new ThreadRead(readData,input);
			threadRead.start();
			Thread.sleep(10000);
			
			ThreadWrite tw = new ThreadWrite(writeData, out);
			tw.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
