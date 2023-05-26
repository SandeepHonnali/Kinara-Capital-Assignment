package com.student.portal.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.student.portal.dao.StudentRepository;
import com.student.portal.entity.Student;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private StudentRepository  studentRepository; 
		
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		short ENABLED = 1;
		System.out.println("Email"+email);
		Student student = studentRepository.findByEmail(email);
		
		System.out.println("-----------------------------"+student.getEmail()+"-----------------------");
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(student.getRole());
		
		User user = new User(student.getEmail(), student.getPass(), Arrays.asList(grantedAuthority));
		
		UserDetails userDetails = user;
		
		return userDetails;
	}

}
