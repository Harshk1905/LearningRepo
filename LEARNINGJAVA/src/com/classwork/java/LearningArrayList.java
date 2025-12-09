package com.classwork.java;

import java.util.ArrayList;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList number = new ArrayList<>();
		number.add(20);
		number.add("Harsh");
		number.add(40.5);
		number.add(false);
		number.add(60);
		
		System.out.println(number);
		System.out.println(number.size());
		number.remove(3);
		System.out.println(number);
	}

}
