package com.generic;

import java.util.logging.Logger;

public class Test {
	public static void main(String[] args) {
		showKeyValue1(new FruitGenerator<Integer>());
		
		try {
			Object obj = genericMethod(Class.forName("com.generic.Test"));
			System.out.println(obj.toString());
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showKeyValue1(FruitGenerator<?> obj){
	    System.out.println("泛型测试" + "key value is " + obj.next());
	}
	public static <T> T genericMethod(Class<T> tClass)throws InstantiationException ,
	  IllegalAccessException{
	        T instance = tClass.newInstance();
	        return instance;
	}
}
