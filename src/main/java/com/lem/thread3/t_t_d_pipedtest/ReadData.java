package com.lem.thread3.t_t_d_pipedtest;

import java.io.PipedInputStream;

public class ReadData {

	public void readMethod(PipedInputStream input){
		try {
			System.out.println("read : ");
			byte[] byteArray = new byte[20];
			int readLength = input.read(byteArray);
			while(readLength != -1){
				String newData = new String(byteArray,0,readLength);
				System.out.print(newData+"  ");
				readLength = input.read(byteArray);
			}
			System.out.println();
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
