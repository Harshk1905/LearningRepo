package com.classwork.java;

import java.util.ArrayList;

public class LearninList {

	public static void main(String[] args) {
		ArrayList number=new ArrayList<>();
		number.add(20);
		number.add(20.5);
		number.add("harsh");
		System.out.println(number);
		System.out.println(number.size());
		System.out.println(number.remove(1));
		System.out.println(number);
		
	}

}
