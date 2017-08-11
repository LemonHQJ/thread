package com.lem.thread4;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;


/*   
	管道流: 
	PipedInputStream 
	void connect(PipedOutputStream src)  
	使此管道输入流连接到管道输出流 src 
	 
	PipedOutputStream 
	void connect(PipedInputStream snk)   
	 
	在JDK我们看到PipedInputStream中有管道缓冲区,用来接收数据 
	 
	管道流内部在实现时还有大量的对同步数据的处理 
	管道输出流和管道输入流执行时不能互相阻塞,所以一般要开启独立线程分别执行 
	顺便复习了多线程操作 
	 
	[示例]:管道流 
*/  
public class Demo {
		  public static void main(String[] args)  throws Exception  
		  {  
//		    PipedInputStream pin = new PipedInputStream();  
//		    PipedOutputStream pout = new PipedOutputStream();  
//		    pin.connect(pout);  //输入流与输出流连接  
//		      
//		    ReadThread readTh   = new ReadThread(pin);  
//		    WriteThread writeTh = new WriteThread(pout);  
//		    new Thread(readTh).start();  
//		    new Thread(writeTh).start();  
		  }  
		    
		  public static void sop(Object obj) //打印  
		  {  
		    System.out.println(obj);  
		  }  
}
