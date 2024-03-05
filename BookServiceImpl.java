package com.dipika.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipika.library.dao.BookDao;
import com.dipika.library.entity.Book;


@Service
public class BookServiceImpl implements BookService{
    
	@Autowired
	private BookDao bookDao;

    public String addBook(Book book) {
		bookDao.save(book);
	 	   return "Save my object";
	}
    
	public List<Book> getAllBooks() {
		return bookDao.findAll();
	}

	public Book getBookById(Integer bookId) {
		return bookDao.findById(bookId).get();
	}

	public String updateBook(Book book) {
		bookDao.saveAndFlush(book);
		return "update Book";

	}

	public String deleteRecord(Integer bookId) {
		bookDao.deleteById(bookId);
		return "Delete Record";
	}

	
    public String updateStock(Integer bookQuantity,String bookName) {
		Book book=bookDao.getbookbyName(bookName);
		Integer quantity=book.getBookQuantity();
		book.setBookQuantity(quantity+bookQuantity);
		bookDao.save(book);
		return "update book Stock";
	}


	public List<Book> getBookByName(String bookName) {
		return bookDao.findByName(bookName);

	} 

/*	public List<Book> getBookByType(String bookType) {
		return bookDao.getBookByType(bookType);

	}*/

	
	
	/*public List<Book> getBookByAuthorName(String authorName) {
		return bookDao.getBookByAuthorName(authorName);
	}*/
	

}
