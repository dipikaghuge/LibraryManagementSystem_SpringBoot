package com.dipika.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.dipika.library.entity.Book;


@Repository
public interface BookDao  extends JpaRepository<Book, Integer>
{

    @Query("select b from Book b where b.bookName LIKE :bookName")  
	public List<Book> findByName(@Param("bookName") String bookName );
    
    @Query("select b from Book b where b.bookName =:bookName")  
    public Book getbookbyName(@Param("bookName") String bookName );
	/*
	List<Book> getBookByType(String bookType);
	List<Book> getBookByAuthorName(String authorName);*/

	
}
