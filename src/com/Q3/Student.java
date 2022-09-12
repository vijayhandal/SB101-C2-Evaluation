package com.Q3;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int marks, String address) {
		// TODO Auto-generated constructor stub
		this.setRoll(roll);
		this.setName(name);
		this.setMarks(marks);
		this.setAddress(address);
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	

}
