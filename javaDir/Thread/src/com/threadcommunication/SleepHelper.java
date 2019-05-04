package com.threadcommunication;

public class SleepHelper {
	public static void sleep(long sleepTime) {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
