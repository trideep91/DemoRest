package com.trideep.demorest;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository 
{

	List<Student> students;
	
	public StudentRepository()
	{
		students = new ArrayList<>();
		
		Student a1 = new Student();
		a1.setId(101);
		a1.setName("Trideep");
		a1.setPoint(60);
		
		Student a2 = new Student();
		a2.setId(102);
		a2.setName("Ankur");
		a2.setPoint(70);
		
		Student a3 = new Student();
		a3.setId(103);
		a3.setName("Saurabh");
		a3.setPoint(50);
		
		Student a4 = new Student();
		a4.setId(104);
		a4.setName("Dev");
		a4.setPoint(55);
		
		students.add(a1);
		students.add(a2);
		students.add(a3);
		students.add(a4);
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	public Student getStudent(int id)
	{
		for(Student a: students)
		{
			if(a.getId()==id)
				return a;
		}
		return null;
	}

	public void create(Student a1) {
		// TODO Auto-generated method stub
		students.add(a1);
	}
}

