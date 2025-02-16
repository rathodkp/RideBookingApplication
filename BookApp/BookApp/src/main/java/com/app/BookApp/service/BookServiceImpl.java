package com.app.BookApp.service;
//import java.util.Optional;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.BookApp.Entity.Book;

@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookRepository bookrepo;
	
	
	@Override
	public Book addbook(Book book) {
		return bookrepo.save(book) ;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookrepo.findAll();
	}

	@Override
	public Book getBookById(long id) {
	    return bookrepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
	}


	@Override
	public Book updateBook(long id, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		
	}

	
}
