package com.Q1;

import java.util.Comparator;

public class ByAuther implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		
		String a = b1.getAuthor();
		String b = b2.getAuthor();
		return a.compareTo(b);
	}

}
