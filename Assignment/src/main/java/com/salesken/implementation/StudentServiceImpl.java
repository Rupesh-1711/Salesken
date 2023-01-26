package com.salesken.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesken.exception.StudentException;
import com.salesken.model.Semester1;
import com.salesken.model.Semester2;
import com.salesken.model.Student;
import com.salesken.repository.StudentRepository;
import com.salesken.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private  StudentRepository sRepo;
	

	
	@Override
	public Student addStudent(Student student) throws StudentException {
		Optional<Student> student1 = sRepo.findById(student.getRoll());
		if(student1.isPresent()) {
			throw new StudentException("Student already Present");
		     
		}
		
		sRepo.save(student);	
		
		return student;
	}

	@Override
	public int averageOfClass() {
		
		List<Student> std = sRepo.findAll();
		 int total =0;
		 int count =0;
		
		 for(int i=0;i<std.size();i++) {
			 if(std.get(i).getSem2() !=null) {
				 total= total+(std.get(i).getSem2().getSem2EnglishMarks()+std.get(i).getSem2().getSem2MathsMarks()+std.get(i).getSem2().getSem2ScienceMarks());
				 count=count++;	 
			 }

		 }
		 
		 System.out.println(std.size());

		return total/count;
	}

	@Override
	public String averageOfSubject() {
		int maths =0;
		int science =0;
		int english=0;
		int count =0;
		int maths2 =0;
		int science2 =0;
		int english2=0;
		int count2 =0;
		List<Student> std = sRepo.findAll();
		 for(int i=0;i<std.size();i++) {
			 if(std.get(i).getSem1()!=null )
			 maths = maths+ std.get(i).getSem1().getSem1MathsMarks();
			 science =science + std.get(i).getSem1().getSem1ScienceMarks();
			 english = english + std.get(i).getSem1().getSem1EnglishMarks();
			 count++;
		 }
		 
		 for(int i=0;i<std.size();i++) {
			 if(std.get(i).getSem2()!=null)
			 maths2 = maths2+ std.get(i).getSem2().getSem2MathsMarks();
			 science2 =science2 + std.get(i).getSem2().getSem2ScienceMarks();
			 english2 = english2 + std.get(i).getSem2().getSem2EnglishMarks();
			 count2++;
		 }
		return "Avarage marks of Semester1 : Maths"+maths/count+" Science :"+science/count+" English :"+english/count+" \n"+"Avarage marks of Semester2 : Maths"+maths2/count2+" Science :"+science2/count2+" English :"+english2/count2+" \n";
	}

	@Override
	public List<Student> top2Students() {
		
		return null;
	}

	@Override
	public Student addSem1Marks(Semester1 sem1,Integer studenId) throws StudentException {
	    Optional<Student> std= sRepo.findById(studenId);
	    if(std.isEmpty()) {
	    	throw new StudentException("Student not found");
	    }
	    Student std1 = std.get();
	    std1.setSem1(sem1);
	    sRepo.save(std1);
	    
		return std1;
	}

	@Override
	public Student addSem2Marks(Semester2 sem2,Integer studenId) throws StudentException {
		 Optional<Student> std= sRepo.findById(studenId);
		    if(std.isEmpty()) {
		    	throw new StudentException("Student not found");
		    }
		    Student std1 = std.get();
		    std1.setSem2(sem2);
		    sRepo.save(std1);
			return std1;
	}

}
