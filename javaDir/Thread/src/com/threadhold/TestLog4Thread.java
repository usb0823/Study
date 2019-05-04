package com.threadhold;

public class TestLog4Thread {
	
	public static void main(String[] args) throws InterruptedException{
//		LogTimeChecker.end();
		TestLog();
	}
	public static void TestLog() throws InterruptedException
    {
        Calculator c = new Calculator();

        Thread t1 = new Thread(new AddRunable(c));
        t1.start();
        
        Thread t2 = new Thread(new SubRunable(c));//SubRunable
        t2.start();
        t1.join();
//        t2.join();
        
        System.out.println("现在轮到我了");
    }
}
