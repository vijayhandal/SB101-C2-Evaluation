package com.Q1;

import java.util.Comparator;

public class ByIsbn implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int a = o1.getIsbn();
		int b = o2.getIsbn();
		if(a>b) {
			return +1;
		}else if(a<b) {
			return -1;
		}
		
		return 0;
	}

}
