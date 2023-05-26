package com.student.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.portal.dao.StudentRepository;
import com.student.portal.entity.Student;
import com.student.portal.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findOne(id);
	}

	@Override
	public List<Student> getStudentList() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		/*Student studentFromDB = studentRepository.findOne(student.getId());
		studentFromDB.setContact(student.);*/
		
		return studentRepository.save(student);
	}

	@Override
	public void delete(Integer id) {
		studentRepository.delete(id);
	}

}
