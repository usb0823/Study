package com.list;

import com.design.single.SingleThing;
import com.design.single.Singleton;

public class Test2 {
	public static void main(String[] args) {
		FinalClass finalClass = new FinalClass();
		finalClass.iamBase();

		SingleThing singleThing = SingleThing.getInstance();
		Singleton singleton = Singleton.getInstance();
	}
}
