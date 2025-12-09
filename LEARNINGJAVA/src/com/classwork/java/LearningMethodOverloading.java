package com.classwork.java;

public class LearningMethodOverloading {

	public static void main(String[] args) {
		LearningMethodOverloading learningMethodOverloading = new LearningMethodOverloading();
		learningMethodOverloading.methodOverLoad(10);
		learningMethodOverloading.methodOverLoad(5, 6);

	}

	public void methodOverLoad(int a) {
		System.out.println(a);
	}

	public void methodOverLoad(int a, int b) {
		System.out.println(a+b);
	}
}
