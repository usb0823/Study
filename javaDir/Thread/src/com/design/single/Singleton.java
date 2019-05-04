package com.design.single;

public class Singleton {
	private Singleton() {
	}

	private static class SingletonBuild {
		private static Singleton value = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonBuild.value;
	}

}
