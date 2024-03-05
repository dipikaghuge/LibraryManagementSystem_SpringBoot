package com.dipika.library.service;

import java.util.List;

import com.dipika.library.entity.Book;

public interface BookService {
	String addBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(Integer bookId);
	List<Book> getBookByName(String bookName);
	//List<Book> getBookByType(String bookType);
	//List<Book> getBookByAuthorName(String authorName);
    String updateStock(Integer bookQuantity,String bookName);
	String deleteRecord(Integer bookId);
	String updateBook(Book book);
	
}
