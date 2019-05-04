package com;

public class HelloJni {
	public native void printJni();
    
    public static void main(String[] args) {
    	System.out.println("aaa");
    	
    	HelloJni hello = new HelloJni();
        hello.printJni();
    }
}
