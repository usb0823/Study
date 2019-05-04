package com;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	static int sum = 0;

	public static void main(String[] args) {
		Executor ex = Executors.newFixedThreadPool(3);Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			ex.execute(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					sum++;
					System.out.println("first " + sum);
				}
			});
//			ex.submit(new Runnable() {
//
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					sum++;
//					System.out.println("second " + sum);
//				}
//			});
		}
	}
}
