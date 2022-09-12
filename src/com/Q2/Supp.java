package com.Q2;

import java.util.function.Supplier;

public class Supp implements Supplier<Student>{

	@Override
	public Student get() {
		// TODO Auto-generated method stub
		
		return new Student(1,"vijay",720);
	}

}
