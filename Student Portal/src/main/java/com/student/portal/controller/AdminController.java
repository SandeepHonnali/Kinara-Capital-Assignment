package com.student.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.portal.entity.Marks;
import com.student.portal.service.MarksService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	private MarksService marksService;

	@PostMapping(value="/addmarks/{id}")
	public Marks addMarks(@RequestBody Marks marks,@PathVariable Integer id) {
		return marksService.addMarks(marks,id);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable Integer id){	
		marksService.deleteMarks(id);
	}
	
	
}
