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
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	@Column(length = 20)
	private String bookName;
	@Column(length = 20)
	private String authorName;
	@Column(length = 20)
	private Integer bookQuantity;
	@Column(length = 20)
	private String bookType;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "book")
	private List<BookIssue>bookIssue;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public List<BookIssue> getBookIssue() {
		return bookIssue;
	}

	public void setBookIssue(List<BookIssue> bookIssue) {
		this.bookIssue = bookIssue;
	}
}
