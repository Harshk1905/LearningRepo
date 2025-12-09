package com.homework.java;

public class Homework10Oct25 {
	
	int l=20,c=10; // l and c are global variables
	
	
	static int x = 100; // x & y are static variables
	static int y = 50;

	public static void main(String[] args) {
		
		//Addition using local variable
		
		int h = 10; //h and b are local variables
		int b = 5;
		
		System.out.println(h+b);
		
		Homework10Oct25 homework10oct25 = new Homework10Oct25();
		homework10oct25.sub();
		
		
	}
	
	public void sub(){
		
		//subtraction using global variable
		
		System.out.println(l-c);
		System.out.println(x*y);
		
	
		
		
	}
	

}
