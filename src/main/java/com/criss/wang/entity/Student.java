package com.criss.wang.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:student.properties"})
@ConfigurationProperties(prefix="student")
@Component
public class Student {

//	@Value("${student.id}")
//	@Value("#{${student.id}*3}")
	private Integer id;
	
//	@Value("${student.name}")
	private String name;
	
//	@Value("${student.age}")
	private int age;
	
//	@Value("${student.addr}")
	private String addr;
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name, int age, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
