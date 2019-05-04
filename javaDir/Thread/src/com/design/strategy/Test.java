package com.design.strategy;

public class Test {
	public static void main(String[] args) {
		Environment environment = new Environment(new AddStrategy());
		System.out.println(environment.calulate(5, 3));
	}
}
