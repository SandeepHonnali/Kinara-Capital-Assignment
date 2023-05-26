package com.student.portal.service;

import com.student.portal.entity.Marks;

public interface MarksService {

	public Marks addMarks(Marks marks, Integer id);

	public void deleteMarks(Integer id);

}
