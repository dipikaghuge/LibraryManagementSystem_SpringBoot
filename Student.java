package com.dipika.library.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
	@Column(length = 20)
    private String studentName;
	@Column(length = 20)
    private String studentEmailId;
	@Column(length = 20)
    private String studentContactNo;
	@Column(length = 20)
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
	private List<BookIssue>bookIssue;

	
	
	
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmailId() {
		return studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public String getStudentContactNo() {
		return studentContactNo;
	}

	public void setStudentContactNo(String studentContactNo) {
		this.studentContactNo = studentContactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<BookIssue> getBookIssue() {
		return bookIssue;
	}

	public void setBookIssue(List<BookIssue> bookIssue) {
		this.bookIssue = bookIssue;
	}
    
	
    
}
