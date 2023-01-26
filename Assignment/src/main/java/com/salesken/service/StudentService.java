package com.salesken.service;

import java.util.List;

import com.salesken.exception.StudentException;
import com.salesken.model.Semester1;
import com.salesken.model.Semester2;
import com.salesken.model.Student;

public interface StudentService {

	public Student addStudent(Student student) throws StudentException;

	public int averageOfClass();
	
	public String averageOfSubject();
	
	public List<Student> top2Students();
	
	Student addSem1Marks(Semester1 sem1,Integer studenId) throws StudentException;
	
	Student addSem2Marks(Semester2 sem2,Integer studenId) throws StudentException;
}
