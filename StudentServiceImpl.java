package com.dipika.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipika.library.dao.StudentDao;
import com.dipika.library.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;

    public String registereStudent(Student student) {
		 studentDao.save(student);
	 	   return "Save student object";
	}

	public Student getStudentById(Integer studentId) {
		return studentDao.findById(studentId).get(); 
	}

	public List<Student> getAllStudents() {
		return studentDao.findAll();

	}

}
