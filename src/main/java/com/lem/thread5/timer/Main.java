package com.lem.thread5.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static Timer timer = new Timer();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static String ds;

	public static void main(String[] args) throws ParseException{
//		demo1();
//		demo2();
//		demo3();
//		demo4();	
//		demo5();
//		demo6();
//		demo7();
//		demo8();
//		demo9();
//		demo10();
//		demo11();
//		demo12();
		demo13();
	}
	
	
	/**
	 * Timer：设置计划任务
	 * 封装任务的类TimerTask
	 * 如果计划时间早于当前时间：则立即执行
	 * @throws ParseException
	 */
	public static void demo1() throws ParseException{
		MyTask task = new MyTask();
		String dateString = "2017-8-15 20:02:00";
		Date dref = sdf.parse(dateString);
		System.out.println("字符串时间为："+ dref.toLocaleString() + "当前时间： " + new Date().toLocaleString());
		timer.schedule(task, dref);//非守护线程
	}
	
	/**
	 * 多个TimerTask任务及延时的测试
	 * Task放在队列中，顺序运行
	 */
	public static void demo2(){
		try {
			MyTask task = new MyTask();
			MyTask2 task2 = new MyTask2();
			String dateString = "2017-8-16 16:13:00";
			String dateString2 = "2017-8-16 16:13:01";
			Date dref = sdf.parse(dateString);
			Date dref2 = sdf2.parse(dateString2);
			System.out.println("字符串时间为："+ dref.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
			System.out.println("字符串时间为："+ dref2.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
			timer.schedule(task, dref);
			timer.schedule(task2, dref);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		延时
//		字符串时间为：2017-8-16 16:13:00	当前时间： 2017-8-16 16:11:37
//		字符串时间为：2017-8-16 16:13:01	当前时间： 2017-8-16 16:11:37
//		 task begin运行了，时间为 ： Wed Aug 16 16:13:00 CST 2017
//		 task end运行了，时间为 ： Wed Aug 16 16:13:20 CST 2017
//		 task2 begin运行了，时间为 ： Wed Aug 16 16:13:20 CST 2017
//		 task2 end运行了，时间为 ： Wed Aug 16 16:13:20 CST 2017
	}
	
	
	/**
//	 * 多个TimerTask任务及延时的测试(提前?)
	 */
	public static void demo3(){
		try {
			MyTask task = new MyTask();
			MyTask2 task2 = new MyTask2();
			String dateString = "2017-8-16 16:17:00";
			String dateString2 = "2017-8-16 16:18:00";
			Date dref = sdf.parse(dateString);
			Date dref2 = sdf2.parse(dateString2);
			System.out.println("字符串时间为："+ dref.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
			System.out.println("字符串时间为："+ dref2.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
			timer.schedule(task, dref);
			timer.schedule(task2, dref);
		} catch (Exception e) {
		}
		
//		提前 task run()中 Thread.sleep(20000) 导致task2提前??????
//		字符串时间为：2017-8-16 16:17:00	当前时间： 2017-8-16 16:16:35
//		字符串时间为：2017-8-16 16:18:00	当前时间： 2017-8-16 16:16:35
//		task begin运行了，时间为 ： Wed Aug 16 16:17:00 CST 2017
//		task end运行了，时间为 ： Wed Aug 16 16:17:20 CST 2017
//		task2 begin运行了，时间为 ： Wed Aug 16 16:17:20 CST 2017
//		task2 end运行了，时间为 ： Wed Aug 16 16:17:20 CST 2017

	}
	
	
	/**
	 * schedule(TimerTask task, Date firstTime, long period)
	 * 无限执行
	 * 如果计划时间早于当前时间：则立即执行
	 */
	public static void demo4(){
		try {
			MyTask task = new MyTask();
			String dateString = "2017-8-16 16:31:00";
			Date dref = sdf.parse(dateString);
			System.out.println("字符串时间为："+ dref.toLocaleString() + "当前时间： " + new Date().toLocaleString());
			timer.schedule(task, dref, 4000);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
		}
		
//		无限循环 每隔4s执行一次
//		字符串时间为：2017-8-16 16:31:00当前时间： 2017-8-16 16:30:36
//		task begin运行了，时间为 ： Wed Aug 16 16:31:00 CST 2017
//		task end运行了，时间为 ： Wed Aug 16 16:31:20 CST 2017
//		task begin运行了，时间为 ： Wed Aug 16 16:31:20 CST 2017
//		task end运行了，时间为 ： Wed Aug 16 16:31:40 CST 2017
//		task begin运行了，时间为 ： Wed Aug 16 16:31:40 CST 2017
//		task end运行了，时间为 ： Wed Aug 16 16:32:00 CST 2017
		
	}
	
	/**
	 * 执行时间被延迟
	 * @throws ParseException 
	 */
	public static void demo5() throws ParseException{
		MyTask1 t1 = new MyTask1();
		String ds = "2017-8-16 16:42:00";
		Date dr = sdf.parse(ds);
		System.out.println("预执行时间为："+ dr.toLocaleString() + " 当前时间： " + new Date().toLocaleString());
		timer.schedule(t1, dr, 4000);
		
//		预执行时间为：2017-8-16 16:42:00 当前时间： 2017-8-16 16:41:59
//		task1 begin运行了，时间为 ： Wed Aug 16 16:42:00 CST 2017
//		task1 end运行了，时间为 ： Wed Aug 16 16:42:05 CST 2017
//		task1 begin运行了，时间为 ： Wed Aug 16 16:42:05 CST 2017
//		task1 end运行了，时间为 ： Wed Aug 16 16:42:10 CST 2017
//		task1 begin运行了，时间为 ： Wed Aug 16 16:42:10 CST 2017
	}
	
	/**
	 * TimerTask:cancel():将自身从任务队列中清除
	 * @throws ParseException 
	 */
	public static void demo6() throws ParseException{
		MyTask3 task = new MyTask3();
		MyTask2 task2 = new MyTask2();
		String dateString = "2017-8-16 19:06:00";
		String dateString2 = "2017-8-16 19:06:20";
		Date dref = sdf.parse(dateString);
		Date dref2 = sdf2.parse(dateString2);
		System.out.println("字符串时间为："+ dref.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
		System.out.println("字符串时间为："+ dref2.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
		timer.schedule(task, dref, 4000);
		timer.schedule(task2, dref2, 4000);
		
//		Task3取消
//		字符串时间为：2017-8-16 19:06:20	当前时间： 2017-8-16 19:05:52
//		task3   运行了时间为 ： Wed Aug 16 19:06:00 CST 2017
//		task3   end ： Wed Aug 16 19:06:00 CST 2017
//		task2 begin运行了，时间为 ： Wed Aug 16 19:06:20 CST 2017
//		task2 end运行了，时间为 ： Wed Aug 16 19:06:20 CST 2017
//		task2 begin运行了，时间为 ： Wed Aug 16 19:06:24 CST 2017
//		task2 end运行了，时间为 ： Wed Aug 16 19:06:24 CST 2017
	}
	
	
	/**
	 * Timer:cancel():将任务队列中的全部任务清空
	 * @throws ParseException 
	 */
	public static void demo7() throws ParseException{
		MyTask4 task = new MyTask4();
		MyTask2 task2 = new MyTask2();
		String dateString = "2017-8-16 19:20:00";
		String dateString2 = "2017-8-16 19:20:20";
		Date dref = sdf.parse(dateString);
		Date dref2 = sdf2.parse(dateString2);
		System.out.println("字符串时间为："+ dref.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
		System.out.println("字符串时间为："+ dref2.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
		timer.schedule(task, dref, 4000);
		timer.schedule(task2, dref2, 4000);
		
//		字符串时间为：2017-8-16 19:20:00	当前时间： 2017-8-16 19:18:51
//		字符串时间为：2017-8-16 19:20:20	当前时间： 2017-8-16 19:18:51
//		Timer cancel Task4 Wed Aug 16 19:20:00 CST 2017
//		Task4   end ： Wed Aug 16 19:20:00 CST 2017

	}
	
	/**
	 * Timer:cancel():不一定停止执行计划任务，而是正常运行	
	 * @throws ParseException 
	 */
	public static void demo8() throws ParseException{
		while(true){
			try {
				MyTask2.i++;
				Timer timer = new Timer();
				MyTask2 t2 = new MyTask2();
				ds = "2017-8-16 19:21:20";
				Date dr = sdf.parse(ds);
				timer.schedule(t2, dr);
				timer.cancel();
			} catch (Exception e) {
			}
		}
		
//		有的未被运行
//		task2 begin运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		正常执行了 93
//		task2 end运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		task2 begin运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		正常执行了 536
//		task2 end运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		task2 begin运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		正常执行了 677
//		task2 end运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		task2 begin运行了，时间为 ： Wed Aug 16 19:40:35 CST 2017
//		.....
		
//		原因：可能未抢到queue锁
//		 public void cancel() {
//		        synchronized(queue) {
//		            thread.newTasksMayBeScheduled = false;
//		            queue.clear();
//		            queue.notify();  // In case queue was already empty.
//		        }
//		 }
		
	}
	/**
	 * schedule(TimerTask task, long delay)
	 * 当前的时间为参考时间，在此时间基础上延迟指定的毫秒数后执行一次TimerTask
	 */
	/**
	 * schedule(TimerTask task, long delay, long period);
	 * 当前的时间为参考时间，在此时间基础上延迟指定delay的毫秒数后执行一次TimerTask
	 */
	
	
	
	/**
	 * schedule任务不延时
	 * @throws ParseException 
	 */
	public static void demo9() throws ParseException{
		MyTask5 mt = new MyTask5();
		ds = "2017-8-16 22:00:00";
		Date dr = sdf.parse(ds);
		System.out.println("设置时间："+ dr.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
		timer.schedule(mt, dr, 3000);
		
//		如果执行任务的时间没有被延迟。则下一次执行任务的时间是上一次任务的开始时间+delay
//		设置时间：2017-8-16 22:00:00	当前时间： 2017-8-16 21:59:37
//		MyTask5    begin Wed Aug 16 22:00:00 CST 2017
//		MyTask5    end  Wed Aug 16 22:00:01 CST 2017
//		MyTask5    begin Wed Aug 16 22:00:03 CST 2017
//		MyTask5    end  Wed Aug 16 22:00:04 CST 2017
//		MyTask5    begin Wed Aug 16 22:00:06 CST 2017
//		MyTask5    end  Wed Aug 16 22:00:07 CST 2017
//		MyTask5    begin Wed Aug 16 22:00:09 CST 2017
//		MyTask5    end  Wed Aug 16 22:00:10 CST 2017
//		MyTask5    begin Wed Aug 16 22:00:12 CST 2017
//		MyTask5    end  Wed Aug 16 22:00:13 CST 2017

	}
	
	
	/**
	 * schedule任务不延时
	 * @throws ParseException 
	 */
	public static void demo10() throws ParseException{
		MyTask5 mt = new MyTask5();
		ds = "2017-8-16 22:23:00";
		Date dr = sdf.parse(ds);
		System.out.println("设置时间："+ dr.toLocaleString() + "	当前时间： " + new Date().toLocaleString());
		timer.schedule(mt, dr, 3000);
		
//		如果执行任务的时间被延迟。则下一次执行任务的时间是上一次任务的结束时间+delay
//		设置时间：2017-8-16 22:23:00	当前时间： 2017-8-16 22:22:14
//		MyTask5    begin Wed Aug 16 22:23:00 CST 2017
//		MyTask5    end  Wed Aug 16 22:23:05 CST 2017
//		MyTask5    begin Wed Aug 16 22:23:05 CST 2017
//		MyTask5    end  Wed Aug 16 22:23:10 CST 2017
//		MyTask5    begin Wed Aug 16 22:23:10 CST 2017
//		MyTask5    end  Wed Aug 16 22:23:15 CST 2017
//		MyTask5    begin Wed Aug 16 22:23:15 CST 2017


	}
	
	
	
	
	/**
	 * 
	 * scheduleAtFixedRate(TimerTask task, Date firstTime, long period)未被延时
	 * 延时：下一次执行时间以上次“结束”为参考(未被延时亦是)
	 * @throws ParseException 
	 */
	public static void demo11() throws ParseException {
		MyTask2 t5 = new MyTask2();
		String ds1 = "2017-8-18 18:04:00";
		Date dr1 = sdf.parse(ds1);
		System.out.println("设置时间为："+ dr1.toLocaleString() + "当前时间： " + new Date().toLocaleString());
		timer.schedule(t5, dr1, 6000);//非守护线程
	}
	
	
	/**
	 * schedule不具有追赶执行性
	 * scheduleAtFixedRate具有追赶执行性
	 * @throws ParseException
	 */
	public static void demo12() throws ParseException {
		MyTask6 t6 = new MyTask6();
		String date = "2017-8-20 15:37:00";
		Date dr = sdf.parse(date);
		System.out.println("设置时间为："+ dr.toLocaleString() + "当前时间： " + new Date().toLocaleString());
		timer.schedule(t6, dr, 6000);//非守护线程
//		设置时间为：2017-8-20 15:37:00当前时间： 2017-8-20 16:27:36    37~27之间的任务不再执行
//		task6 begin运行了，时间为 ： Sun Aug 20 16:27:36 CST 2017
//		task6 end运行了，时间为 ： Sun Aug 20 16:27:36 CST 2017
	}
	
	/**
	 * scheduleAtFixedRate具有追赶执行性
	 * @throws ParseException
	 */
	public static void demo13() throws ParseException {
		MyTask6 t6 = new MyTask6();
		String date = "2017-8-20 15:37:00";
		Date dr = sdf.parse(date);
		System.out.println("设置时间为："+ dr.toLocaleString() + "当前时间： " + new Date().toLocaleString());
		timer.schedule(t6, dr, 6000);//非守护线程
		
	}
}

