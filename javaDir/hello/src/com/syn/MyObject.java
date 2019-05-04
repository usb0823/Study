package com.syn;

public class MyObject {

    public void method() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
    	System.out.println(Thread.currentThread());
        final MyObject myObject = new MyObject();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                myObject.method();
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                myObject.method();
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
