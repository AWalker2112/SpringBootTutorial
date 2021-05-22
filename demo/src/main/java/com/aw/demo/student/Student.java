package com.aw.demo.student;

import java.time.LocalDate;

public class Student {
	private long id;
	private String name;
	private Integer age;
	private LocalDate DoB;
	private String email;

	public Student() {
		super();
	}

	public Student(String name, Integer age, LocalDate doB, String email) {
		super();
		this.name = name;
		this.age = age;
		DoB = doB;
		this.email = email;
	}

	public Student(long id, String name, Integer age, LocalDate doB, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		DoB = doB;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDoB() {
		return DoB;
	}

	public void setDoB(LocalDate doB) {
		DoB = doB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", DoB=" + DoB + ", email=" + email + "]";
	}

	
}
