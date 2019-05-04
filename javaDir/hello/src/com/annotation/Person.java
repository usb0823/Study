package com.annotation;

import com.annotation.Testzhujie.Column;
import com.annotation.Testzhujie.Table;

@Table("person")
public class Person {
	@Column("name")
	private String name;
	
	@Column("user_name")
	private String userName;
}
