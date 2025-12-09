package com.classwork.java;

public class LearningMethods {

	public static void main(String[] args) {
		
		//We can not write method inside method,but we can write an number of method into the class
		//Purpose of method is to reuse and optimize the code.
		
		LearningMethods learningMethods= new LearningMethods();
		learningMethods.argumentMethod(20);
		learningMethods.noargumentMethod();
		learningMethods.noReturnTypeMethod();
		LearningMethods.staticMethod();
		staticMethod();
		learningMethods.nonStaticMethod();
		
		
		System.out.println(learningMethods.getName());
	}
	
	//Argument Method(also known as parameter): if input is change then code should not be change.
	
	public void argumentMethod(int a) {
		System.out.println(a);
		
	}
	
	//No Argument Method: 
	
	public void noargumentMethod() {
		System.out.println("This is not Argument method");
	}
	
	//Return type method: one methods output can be input for another method
	
	public String getName() {
		return "Harsh";
	}
	
	// No Return type method: 
	
	public void noReturnTypeMethod() {
		System.out.println("This is no retrurntype method");
	}
	
	// Static Method:
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	
	//Non Static method : we can call non static method to other non static method without object.
	
	public void nonStaticMethod() {
		System.out.println("This is non static method");
	}
	
	// Argument+no return type+ non static method:
	// No Argument + no return + non static
	// Return type + no argument + non static
	// no return
	//
	//
	
	
	

}
