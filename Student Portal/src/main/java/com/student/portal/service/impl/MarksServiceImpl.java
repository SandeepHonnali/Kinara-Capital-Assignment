package com.student.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.portal.dao.MarksRepository;
import com.student.portal.dao.StudentRepository;
import com.student.portal.entity.Marks;
import com.student.portal.entity.Student;
import com.student.portal.service.MarksService;

@Service
public class MarksServiceImpl implements MarksService {

	@Autowired
	private MarksRepository marksRepository; 
	
	@Autowired
	private StudentRepository studentRepository; 
	@Override
	public Marks addMarks(Marks marks,Integer id) {
		
		Student student = studentRepository.findOne(id);
		marks.setStudent(student);
		return marksRepository.save(marks);
	}
	@Override
	public void deleteMarks(Integer id) {
		
		marksRepository.delete(id);
	}

}
