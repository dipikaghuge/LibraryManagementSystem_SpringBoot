package com.dipika.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dipika.library.entity.Book;
import com.dipika.library.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	  //http://localhost:8080/addRecord
	  @PostMapping("addRecord")
	   public String addRecord(@RequestBody Book book)
	   {
		   return  bookService.addBook(book);
	   }

	  //http://localhost:8080/getBookObjectById      param ( key=bookId  value=1 )
	  @GetMapping("getBookObjectById")
     public Book getBookObjectById(@RequestParam Integer bookId)
     {
		return bookService.getBookById(bookId);
     }
     
	  //http://localhost:8080/getBookObjectByName      param ( key=bookName  value=java )
	  @GetMapping("getBookObjectByName")
	     public List<Book> getBookObjectByName(@RequestParam String bookName)
	     {
			return bookService.getBookByName(bookName);
	     }

	  
	  //http://localhost:8080/findAllBook
	  @GetMapping("findAllBook")
	  public List<Book> getAllBookObject()
	  {
		return bookService.getAllBooks();
	  }
	  
	  //http://localhost:8080/modifyBookDetails
	  @PutMapping("modifyBookDetails")
     public String modifyBookDetails(@RequestBody Book book)
     {
		return bookService.updateBook(book);
     }
	  
	  
	  //http://localhost:8080/removeBookById
	  @DeleteMapping("removeBookById")
     public  String removeRecordById(@RequestParam Integer bookId)
     {
		return bookService.deleteRecord(bookId); 
     }
 
	  //http://localhost:8080/modifyBookStock
	  @PutMapping("modifyBookStock")
     public String modifyBookStock(@RequestParam Integer bookQuantity,@RequestParam String bookName)
     {
		return bookService.updateStock(bookQuantity,bookName );
     }

}
