package com.student.portal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.portal.entity.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query(value="find Student s where email=:email and enabled=:enabled",nativeQuery=true)
	Student findByEmailAndEnabled(String email, short enabled);

	Student findByEmail(String email);
}
