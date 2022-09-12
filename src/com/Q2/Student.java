package com.Q2;

public class Student {

	private int Id;
	private String Name;
	private int Marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int Id, String Name, int Marks) {
		// TODO Auto-generated constructor stub
		this.setId(Id);
		this.setMarks(Marks);
		this.setName(Name);
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	
	
}

