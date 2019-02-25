package com.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 使用对象输出流写对象和对象输入流读对象 注意：如果Student没有序列化，会抛出java.io.NotSerializableException
 * Serializable：序列号，是一个标识接口，只起标识作用，没有方法 当一个类的对象需要IO流进行读写的时候，这个类必须实现接口
 */
public class ObjectOperate {

	private static final String path = "/Users/liuwei/Documents/zhy/test/file1.java";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
		// 创建对象输入流的对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		// 读取对象
		try {
			while (true) {
				Object obj = ois.readObject();
				System.out.println(obj);
			}
		} catch (EOFException e) {
			System.out.println("读到了文件末尾");
		}

		// 释放资源
		ois.close();

	}

	public static void writeObject() throws FileNotFoundException, IOException {
		// 创建对象输出流的对象
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 创建学生对象
		Student s1 = new Student("张三", 20);
		Student s2 = new Student("李四", 30);
		Student s3 = new Student("王五", 10);
		// 写出学生对象
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		// 释放资源
	}
}
