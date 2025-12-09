package com.classwork.java;


public class LearninInheritanceC extends LearninInheritanceB {

	public static void main(String[] args) {
		LearninInheritanceC learInheritanceC = new LearninInheritanceC();
		learInheritanceC.addition();
		learInheritanceC.subtraction();
		//LearninInheritanceB learninInheritanceB = new LearninInheritanceB();
		learInheritanceC.multiplication();
		// Single Inheritance
		
	}
	public void subtraction() {
		c = a -b;
		System.out.println(c);
	}

}
