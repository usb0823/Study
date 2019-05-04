package com.design.single;

public class SingleThing {
	private static SingleThing singleThing;
	static {
		singleThing = new SingleThing();
	}

	public static SingleThing getInstance() {
		return singleThing;
	}

	private SingleThing() {
		System.out.println("I am a thing");
	}
}
