package com.student.portal.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.portal.entity.Student;
import com.student.portal.service.StudentService;



@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping(value="/add")
	public Student addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
	
	@GetMapping(value="/get/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		logger.info("-----{Called get Student By Id Method}------");
		return studentService.getStudentById(id);
	}
	
	@GetMapping(value="/getall") 
	public List<Student> getAllStudents() {
		return studentService.getStudentList();
	}
	
	@PutMapping(value="/update/{id}")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable Integer id) {
		studentService.delete(id);
	}
}
