package com;

import java.util.ArrayList;

public class TestThread {
	
	private Object object = new Object();
	
	private ArrayList<Object> list = new ArrayList<>();
	public static void main(String args[]) {
		
		new Thread() {
			@Override
			public void run() {
				super.run();
				while(true) {
					
				}
			}
		}.start();
	}
	
	private void create() {
		synchronized (object) {
			if(list.size() < 10){
				list.add(new Object());
			}else {
				
			}
		}
	}
	private void use() {
		synchronized (object) {
			if(list.size() >= 1) {
				list.remove(0);
			}else {
				
			}
		}
	}
}
