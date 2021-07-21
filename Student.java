//package com.aarya.corejava;


public class Student{
	
	String studentName;
	
	
	
	int stdId;
	String emailId;
	
	
	int   hello(int id) {
		stdId=id;
		System.out.println("Hello Aarya"+id);
		return 7;
	}
	public Student() {
		studentName="Aarya";
		
		emailId="Aarya.123@gmail.com";
	}
	@Override
	public String toString() {
		return "Student [Name=" + studentName + ", Id=" +", email=" + emailId + "]";
	}
	
}

