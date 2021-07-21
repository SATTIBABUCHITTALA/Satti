//package com.aarya.corejava;


class Demo{
	
	int id;
	
	
	void printValue(int n) {
	
		System.out.println(n);
		
	}
	
	
	
}



public class ScopeDemo {

	public static void main(String args[]) {
		
		Demo demo=new Demo();
		demo.printValue(2);
		
	}
	
	
}
