package com.dipika.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dipika.library.entity.Student;
import com.dipika.library.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	  //http://localhost:8080/registereStudent
	  @PostMapping("registereStudent")
	   public String addRecord(@RequestBody Student student )
	   {
		   return  studentService.registereStudent(student);
	   }

	  //http://localhost:8080/getStudentById/1
	  @GetMapping("getStudentById/{bookId}")
     public Student getStudentById(@PathVariable Integer studentId)
     {
		return studentService.getStudentById(studentId);
     }
     
	  //http://localhost:8080/findAllStudents
	  @GetMapping("findAllStudents")
	  public List<Student> getAllStudentObject()
	  {
		return studentService.getAllStudents();
	  }


}
