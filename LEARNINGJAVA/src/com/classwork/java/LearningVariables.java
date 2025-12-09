package com.classwork.java;

public class LearningVariables {

	int b = 20; // it is a global variable
	static int c = 30; // it is a static variable
	
	public static void main(String[] args) {
		
	//Local Variable :- Variable declare inside the method is known as local variable
	//Global Variable :- Variable which is declare inside the class but declare out side the method
	//Static Variable :- it can be called in static and non static methods both
	//Non Static Variable :- it can be called only in non static method
		
		int a = 10; // it is a local variable
		System.out.println(a);

		LearningVariables learningVariables=new LearningVariables();
		learningVariables.add();
		System.out.println(c);
		//System.out.println(b);// it will give the error because b is non static variable
	}
	
	public void add () {
	//	System.out.println(a); // it will give the error because a is local variable of main method
		System.out.println(b);
		System.out.println(c);
	}
	
	

}
