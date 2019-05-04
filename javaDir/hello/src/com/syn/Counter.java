package com.syn;

public class Counter implements Runnable {
	private int count;

	public Counter() {
		count = 0;
	}
	public synchronized void setCount(int count) {
		this.count = count;
		System.out.println("setCount" + Thread.currentThread());
	}

	public void countAdd() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + ":" + (count++) + Thread.currentThread());
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 非synchronized代码块，未对count进行读写操作，所以可以不用synchronized
	public void printCount() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " count:" + count);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		if (threadName.equals("A")) {
			countAdd();
		} else if (threadName.equals("B")) {
			printCount();
		}
	}
}
