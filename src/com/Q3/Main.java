package com.Q3;

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();

		list.add(new Student(2,"Sumit",700,"Pune"));
		list.add(new Student(3,"Vijay",720,"Pune"));
		list.add(new Student(4,"Ajay",600,"Pune"));
		list.add(new Student(5,"Rohit",400,"Pune"));
		list.add(new Student(6,"Akash",450,"Pune"));
		
		List<Student>sl = list.stream().filter(a->{
			return a.getMarks()>500;
		}).toList();
		
		
		List<Employee>EL = sl.stream().map(a->{

				int id = a.getRoll();
			 return	new Employee(id,a.getName(),a.getMarks()*10000,a.getAddress());
			
			
		}).toList();
		
		EL.forEach(a->{System.out.println(a);});
	}

}
