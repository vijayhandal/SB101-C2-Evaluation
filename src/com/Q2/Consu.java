package com.Q2;

import java.util.function.Consumer;

public class Consu implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		// TODO Auto-generated method stub
		System.out.println("Student Id: "+t.getId());
		System.out.println("Student Name: "+t.getName());
		System.out.println("Stutent marks: "+t.getMarks());
		
	}

}
