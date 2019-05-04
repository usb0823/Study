package com.design.strategy;

public class Environment {
	private Strategy mStrategy;

	public Environment(Strategy strategy) {
		mStrategy = strategy;
	}

	public int calulate(int i, int j) {
		return mStrategy.cale(i, j);
	}
}
