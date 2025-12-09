package com.classwork.java;

public class LearningMethodOverridingB extends LearningMethodOverridingA {

	public static void main(String[] args) {
		LearningMethodOverridingB learningMethodOverridingB = new LearningMethodOverridingB();
		learningMethodOverridingB.animal();
		
	}
	
	public void animal() {
		System.out.println("This is animal from B class");
		
		//Can we override the Static method - No
	}

}
