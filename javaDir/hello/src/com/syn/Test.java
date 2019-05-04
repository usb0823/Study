package com.syn;

public class Test {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread thread1 = new Thread(counter, "A");
		Thread thread2 = new Thread(counter, "B");
		
//		thread2.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 10; i ++) {
					counter.setCount(100 * i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		thread1.start();
	}
}
