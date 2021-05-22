package com.aw.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "api/v1/student")
public class StudentController {

	@GetMapping
	public List<Student> getStudents() {
		return List.of(
				new Student(1l, 
						"Alex", 
						20, 
						LocalDate.of(2000, 01, 01),
						"Alex@gmail.com" ));
	}
}
