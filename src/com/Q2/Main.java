package com.Q2;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
	   
	 
		
		
		
		
		List<Student> list  = new ArrayList<>();
		
		list.add(new Student(2,"Sumit",700));
		list.add(new Student(3,"Vijay",720));
		list.add(new Student(4,"Ajay",600));
		list.add(new Student(5,"Rohit",400));
		list.add(new Student(6,"Akash",450));
		
		
		


		Predicate<Student> pr = i->i.getMarks()<500;
		
			for(Student s: list) {
				System.out.println(pr.test(s));
			}

			Consumer<Student> c = new Consu();
			 c.accept(new Student(2,"Sumit",700));
			
			 Supplier<Student> s = new Supp();
			 System.out.println(s.get());
			 
			 Function<String , Integer> f = new Func();
			int value =  f.apply("50");
			System.out.println(value+200);

	}

	

	

}
