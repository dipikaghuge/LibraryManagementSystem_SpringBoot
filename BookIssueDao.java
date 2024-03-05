package com.dipika.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipika.library.entity.BookIssue;


@Repository
public interface BookIssueDao  extends JpaRepository<BookIssue, Integer>
{

	/*List<BookIssue> displayUnreturnBook();
	List<BookIssue> displayUnIssuedBook();
	List<BookIssue> getIssuedBook(Integer studentId);
	String requestIssueBook(BookIssue bookIssue);
	String returnBook(BookIssue bookIssue);
	String ApprovedIssueBook(BookIssue bookIssue);*/

	
}
