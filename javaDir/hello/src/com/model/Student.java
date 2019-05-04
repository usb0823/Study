package com.model;

import java.io.Serializable;
//学生类
public class Student implements Serializable{
  private static final long serialVersionUID = -8942780382144699003L;
  String name;
  int age;
  public Student(String name,int age){
      this.name=name;
      this.age=age;
  }
  @Override
  public String toString() {
      return "Student [name=" + name + ", age=" + age + "]";
  }    
}
