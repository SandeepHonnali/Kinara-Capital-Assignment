package com.student.portal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Marks {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Double sub1;
	private Double sub2;
	private Double sub3;
	private Double sub4;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSub1() {
		return sub1;
	}

	public void setSub1(Double sub1) {
		this.sub1 = sub1;
	}

	public Double getSub2() {
		return sub2;
	}

	public void setSub2(Double sub2) {
		this.sub2 = sub2;
	}

	public Double getSub3() {
		return sub3;
	}

	public void setSub3(Double sub3) {
		this.sub3 = sub3;
	}

	public Double getSub4() {
		return sub4;
	}

	public void setSub4(Double sub4) {
		this.sub4 = sub4;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
