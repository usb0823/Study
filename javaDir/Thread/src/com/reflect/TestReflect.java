package com.reflect;

import java.io.IOException;
import java.io.InputStream;

public class TestReflect extends Object {
	
	public int i = 0;
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Class mClass = TestReflect.class;
		System.out.println("mClass = " + mClass.toString());
		Object object = new Object();

		try {
			Class mClass1 = Class.forName("com.reflect.TestReflect");
			TestReflect testReflect = (TestReflect) mClass1.newInstance();
			testReflect.test("aaaaa");
			testReflect.test2();
			System.out.println("mClass1 = " + mClass.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		test1();
		
		
	}

	private void test(String str) {
		System.out.println("test111" + str);
	}
	private void setAge(Integer i) {
		System.out.println("setAge" + i);
	}
	
	private static void test1() throws ClassNotFoundException {
		// 1. 获取一个系统的类加载器(可以获取，当前这个类PeflectTest就是它加载的)
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		System.out.println(classLoader);

		// 2. 获取系统类加载器的父类加载器（扩展类加载器，可以获取）.
		classLoader = classLoader.getParent();
		System.out.println(classLoader);

		// 3. 获取扩展类加载器的父类加载器（引导类加载器，不可获取）.
		classLoader = classLoader.getParent();
		System.out.println(classLoader);

		// 4. 测试当前类由哪个类加载器进行加载（系统类加载器）:
		classLoader = Class.forName("com.reflect.TestReflect").getClassLoader();
		System.out.println(classLoader);

		// 5. 测试 JDK 提供的 Object 类由哪个类加载器负责加载（引导类）
		classLoader = Class.forName("java.lang.Object").getClassLoader();
		System.out.println(classLoader);
	}
	
	private void test2() throws IOException {
		InputStream in1 = null;
        in1 = this.getClass().getClassLoader().getResourceAsStream("reflect1.txt");
        byte[] bytes = new byte[1024];
        int i = 0;
        while((i = in1.read(bytes)) != -1) {
        	System.out.print(new String(bytes));
        }
	}
}
