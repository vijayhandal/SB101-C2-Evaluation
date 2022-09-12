package com.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Library {
	
	List<Book> booklist = new ArrayList<>();
	
	public void addBook(Book book)throws BookException{
		
		for(int i=0;i<booklist.size();i++) {
			if(book.getAuthor().equals(booklist.get(i).getAuthor())&&book.getBookName().equals(booklist.get(i).getBookName())&&book.getIsbn()==booklist.get(i).getIsbn()) {
				BookException BE = new BookException("This Book is already in the list: ");
				throw BE;
			}
		}
		booklist.add(book);
		System.out.println("Book added successfully");
		
	}
	
	public List viewAllBooks()throws BookException{
		if(booklist.size()==0) {
			BookException BE = new BookException("Book List i Empty :");
			throw BE;
		}
		return booklist;
	}
	
	public List viewBooksByAuthor(String author)throws BookException{
		
		
		for(int i=0;i<booklist.size();i++) {
			if(author.equals(booklist.get(i).getAuthor())) {
				
			}else {
				BookException BE = new BookException("None of the book published by the author "+author);
				throw BE;
			}
		}
		
		Set<Book> set  = new TreeSet<>(new ByAuther());
		
		for(Book b:booklist) {
			set.add(b);
		}
		
		List<Book> lis = new ArrayList<>();
		
		for(Book b:set) {
			if(b.getAuthor().equals(author)) {
				lis.add(b);
			}
		}
		
		if(lis.size()==0) {
			BookException BE = new BookException("None of the book published by the author "+author);
			throw BE;
		}
		
		return lis;
	}
	
	public Book getBookByISBN(int isbn)throws BookException{
		
		
		for(int i=0;i<booklist.size();i++) {
			if(isbn!=booklist.get(i).getIsbn()) {
				BookException BE = new BookException("None of the book published by the Isbn "+isbn);
				throw BE;
			}
		}
		
		Set<Book> set  = new TreeSet<>(new ByIsbn());
		
		for(Book b:booklist) {
			set.add(b);
		}
		
		Book boo = null;
		
		for(Book b:set) {
			if(b.getIsbn()==isbn) {
				boo=b;
			}
		}
		
		
		return boo;
	}

}
