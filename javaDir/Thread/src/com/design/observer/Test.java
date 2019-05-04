package com.design.observer;

public class Test {
	public static void main(String[] args) {
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		MySubject mySubject = new MySubject();
		mySubject.add(observer1);
		mySubject.add(observer2);
		mySubject.operation();
	}
}
