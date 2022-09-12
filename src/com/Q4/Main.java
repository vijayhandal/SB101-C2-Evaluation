package com.Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		
		System.out.println("Enter 10 names: ");
		
		for(int i=1;i<=10;i++) {
			System.out.println("Name - "+i);
			names.add(sc.next());
		}
		
		List<String> Ename = names.stream().filter(a->{
			return a.length()%2==0;
		}).map(b->{
			return b.toUpperCase(); 
		}).toList();
		
		
		
		
		List<String> sortedlist =  Ename.stream().sorted((a,b)->{
		   return a.compareTo(b);
		}).toList();
		
		System.out.println("Original List------\n");
		names.forEach(a->{System.out.println(a);});
		System.out.println("\nTransformed List----\n");
		sortedlist.forEach(a->{System.out.println(a);});
		
		
	}

}
