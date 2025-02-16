package com.app.BookApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long BookId;
	private String BookName;
	private Double price;
	
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Book() {	
	}

	public long getBookId() {
		return BookId;
	}

	public void setBookId(long bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + ", price=" + price + ", getPrice()=" + getPrice()
				+ ", getBookId()=" + getBookId() + ", getBookName()=" + getBookName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
