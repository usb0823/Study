package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Hello2 {
	public static void main(String args[]) throws IOException {
		String path = "/Users/liuwei/Documents/zhy/test/Hello.java";
//		FileInputStream file = new FileInputStream(path);

//		
//		InputStreamReader reader= new InputStreamReader(new FileInputStream(path));
//		FileReader reader = new FileReader(new File(path));
//		
//		FileInputStream reader = new FileInputStream(new File(path));

		char[] chars = new char[1024];
//		int i = reader.read(chars);
//		System.out.println("i = " + i);
//		System.out.println(String.valueOf(chars));

		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));// );
		byte[] bytes = new byte[1024];
//		reader.read(bytes);
		System.out.println("test1 = " + new String(bytes));
//		bufferedReader.read(chars);

		int cus;

		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("/Users/liuwei/Documents/zhy/test/Hello22.java"));
		while ((cus = bufferedReader.read(chars)) != -1) {
			System.out.println("string = " + new String(chars));
			bufferedWriter.write(chars);
		}
		bufferedReader.close();
		bufferedWriter.close();

//		System.out.println(String.valueOf(chars));

		PrintWriter pw = new PrintWriter(new FileWriter("/Users/liuwei/Documents/zhy/test/Hello33.java"), true);
		pw.write("测试打印流");
		pw.println("此句之后换行");
		pw.println("特有功能：自动换行和自动刷新");
		pw.println("利用构造器设置自动刷新");
		pw.close();

		
//		Object object = new Object();
//		
//		ExecutorService e = Executors.newFixedThreadPool(3);
//		 //submit方法有多重参数版本，及支持callable也能够支持runnable接口类型.
//		Future<Object> future = e.submit(new MyCallable());	
//		future.isDone(); //return true,false 无阻塞
//		try {
//			future.get();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (ExecutionException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} // return 返回值，阻塞直到该线程运行结束
	}
//	private class MyCallable implements Callable<Object>{
//
//		@Override
//		public Object call() throws Exception {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//	}
}
