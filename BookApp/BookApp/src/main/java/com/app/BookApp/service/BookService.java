package com.app.BookApp.service;

import java.util.List;

import com.app.BookApp.Entity.Book;

public interface BookService {
	
	Book addbook(Book book);
	List <Book> getAllBooks();
	
	Book getBookById(long id);
	Book updateBook(long id, Book book);
	void deleteBook(long id);
	
	

}
