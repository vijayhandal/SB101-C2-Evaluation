package com.Q2;

import java.util.function.Function;

public class Func implements Function<String, Integer>{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		int value  = Integer.parseInt(t);
		
		return value;
	}

}
