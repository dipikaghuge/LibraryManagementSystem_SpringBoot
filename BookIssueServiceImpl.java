package com.dipika.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipika.library.dao.BookIssueDao;
import com.dipika.library.entity.BookIssue;

@Service
public class BookIssueServiceImpl implements BookIssueService{
	@Autowired
	   private BookIssueDao bookIssueDao;


   /* public String requestIssueBook(BookIssue bookIssue) {
		return bookIssueDao.requestIssueBook(bookIssue);
	}
    

	public String returnBook(BookIssue bookIssue) {
		return bookIssueDao.returnBook(bookIssue);
	}
*/
	
	public BookIssue getBookIssuedById(Integer issueId) {
		return bookIssueDao.findById(issueId).get();

	}

/*	
	public List<BookIssue> getIssuedBook(Integer studentId) {
		return bookIssueDao.getIssuedBook(studentId);
	}
*/
	public void inputConfirmIssueBook() {
		
		
	}

/*	public List<BookIssue> displayUnIssuedBook() {
		return bookIssueDao.displayUnIssuedBook();
	}
*/
	
	public BookIssue findRecordByIssuedId(Integer issuedId) {
		return bookIssueDao.findById(issuedId).get();
	}

	/*
	public String ApprovedIssueBook(BookIssue bookIssue) {
		return bookIssueDao.ApprovedIssueBook(bookIssue);
	}

	public List<BookIssue> displayUnreturnBook() {
		return bookIssueDao.displayUnreturnBook();
	}
*/
}
