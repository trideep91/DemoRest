package com.trideep.demorest;

//import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource 
{

	StudentRepository repo = new StudentRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Student> getStudents()
	{
		System.out.println("getStudent called");
		
		
		return repo.getStudents();
	}
	
	@GET
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("id") int id)
	{
		
		return repo.getStudent(id);
	}
	
	@POST
	@Path("student")
	public Student createStudent(Student a1)
	{
		System.out.println(a1);
		repo.create(a1);
		
		return a1;
	}
}
