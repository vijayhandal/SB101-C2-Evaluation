package com.Q1;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws BookException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Search book by ISBN");
		System.out.println("5.Exit\n");
		
		
		
		
		
		Library lab = new Library();
		
		while(true) {
			System.out.println("Enter your choice:");
			
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println("Enter the isbn no:");
				int isbn = sc.nextInt();
				System.out.println("Enter the book name: ");
				String bookname = sc.next();
				System.out.println("Enter the author name: ");
				String auther = sc.next();
				
				lab.booklist.add(new Book(isbn,bookname,auther));
				
			}else if(n == 2) {
				try {
					List<Book> allb = lab.viewAllBooks(); 
					for(Book b:allb) {
						System.out.println(b);
					}
				}catch (BookException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
			}else if(n == 3) {
				
				System.out.println("Enter the author name: ");
				String auther = sc.next();
				
				try {
					List<Book> abook =  lab.viewBooksByAuthor(auther);
					for(Book ab:abook) {
						System.out.println("ISBN no:"+ab.getIsbn());
						System.out.println("Book name:"+ab.getBookName());
						System.out.println("Author name:"+ab.getAuthor());
					}
				}catch (BookException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
			}else if(n == 4) {
				
				System.out.println("Enter the isbn: ");
				int isbn = sc.nextInt();
				
				try {
					Book ab =  lab.getBookByISBN(isbn);
					
						System.out.println("ISBN no:"+ab.getIsbn());
						System.out.println("Book name:"+ab.getBookName());
						System.out.println("Author name:"+ab.getAuthor());
					
				}catch (BookException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
			}else if(n == 5) {
				System.out.println("Thank You..!!");
				break;
			}else {
				System.out.println("Please Enter Valid Input: ");
			}
		}

	}

}
