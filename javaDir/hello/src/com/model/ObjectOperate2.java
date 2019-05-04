package com.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 * 使用对象输出流写对象和对象输入流读对象
 *解决读取对象出现异常的问题,使用集合类
 */
public class ObjectOperate2 {
	private static final String path = "/Users/liuwei/Documents/zhy/test/file2.java";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        listMethod();
        //创建对象输入流对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
        //读取数据
        Object obj=ois.readObject();
        //System.out.println(obj);
        //向下转型
        ArrayList<Student> list=(ArrayList<Student>) obj;
        for(Student s:list) {
            System.out.println(s);
        }
        //释放资源
        ois.close();
    }

    public static void listMethod() throws IOException, FileNotFoundException {
        //创建对象输出流的对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
        //创建集合类
        ArrayList<Student> list=new ArrayList<Student>();
        //添加学生对象
        list.add(new Student("zhangsan",20));
        list.add(new Student("lisi",30));
        //写出集合对象
        oos.writeObject(list);
        //释放资源
        oos.close();
    }

}