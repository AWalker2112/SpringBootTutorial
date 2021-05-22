package com.aw.demo.student;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence")
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
