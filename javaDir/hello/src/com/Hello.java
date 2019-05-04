package com;

import java.util.ArrayList;
import java.util.Random;

public class Hello {
	public static void main(String args[]) { 
		System.out.println("zhuy111");
		

		Random random = new Random();
        int iii = random.nextInt(3);
        System.out.println("iiii");
        System.out.println("iiii" + iii);
        
		
		ArrayList list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		ArrayList list2 = new ArrayList();
		
		list2.add("b");
		list2.add("c");
		list2.add("d");
		
		ArrayList aa = (ArrayList)(list1.clone());
		for(int i = 0; i < aa.size(); i ++) {
			System.out.println(aa.get(i));
		}
		
		
	}
}
