package com.aw.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStudents() {
		return List.of(
				new Student(1l, 
						"Alex", 
						20, 
						LocalDate.of(2000, 01, 01),
						"Alex@gmail.com" ));
	}
	
}
