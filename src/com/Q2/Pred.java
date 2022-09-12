package com.Q2;


import java.util.function.Predicate;

public interface Pred extends Predicate<Student>{
	
	public boolean test(Student t);

}
