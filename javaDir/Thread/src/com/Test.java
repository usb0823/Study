package com;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
	
//	public Test(int i) {
//		
//	}
	public static void main(String[] args) {
		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
		
		Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
		
	     long[] arrayOfLong = new long [ 20000 ];        

	        Arrays.parallelSetAll( arrayOfLong, 
	            index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
	        Arrays.stream( arrayOfLong ).limit( 10 ).forEach( 
	            i -> System.out.print( i + " " ) );
	        System.out.println();

	        Arrays.parallelSort( arrayOfLong );        
	        Arrays.stream( arrayOfLong ).limit( 10 ).forEach( 
	            i -> System.out.print( i + " " ) );
	        System.out.println();
	        
	        Test test = new Test();
	        int i = 12_34_555;
	        
	        String[] args1 = {"aaa","bbb"};
//	        List<String> list = ["item"];
//	         String item = list[0];
//	         System.out.println(item);
	         
//	         Set<String> set = {"item"};
	         
//	         Map<String, Integer> map = [{"key":1}];
//	         int value = map["key"];
	}
}
