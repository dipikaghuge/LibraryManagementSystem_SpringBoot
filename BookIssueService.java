package com.dipika.library.service;
import java.util.List;
import com.dipika.library.entity.BookIssue;

public interface BookIssueService {
	//public String requestIssueBook(BookIssue bookIssue);
    //public String returnBook(BookIssue bookIssue);
    BookIssue getBookIssuedById(Integer issueId);
    //List<BookIssue> getIssuedBook(Integer studentId);
    void inputConfirmIssueBook();
    //List<BookIssue> displayUnIssuedBook();
    BookIssue findRecordByIssuedId(Integer issuedId);
    //String ApprovedIssueBook(BookIssue bookIssue);
    //List<BookIssue> displayUnreturnBook();
}
