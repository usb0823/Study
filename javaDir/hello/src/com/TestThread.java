package com;

import java.util.ArrayList;

public class TestThread {

	private byte[] lock = new byte[0];

	private ArrayList<Object> list = new ArrayList<>();

	public static void main(String args[]) {

		MyThread thread = new MyThread();
		thread.start();
		for(int i = 0; i < Integer.MAX_VALUE; i ++) {
			
		}
	}

	private synchronized void create() {
		if (list.size() < 10) {
			list.add(new Object());
		} else {

		}
	}

	private synchronized void use() {
		if (list.size() >= 1) {
			list.remove(0);
		} else {

		}
	}
	
	private static class MyThread extends Thread{
		private int data;
		public void setData(int i) {
			this.data = i;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			System.out.println("this is " + Thread.currentThread());
			System.out.println("this is " + this.toString());
//			while(true) {
//				System.out.println("我是第一句 data = " + data);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("我是第二句 data = " + data);
//			}
		} 
		
		private void test() {
			
		}
	}
}
