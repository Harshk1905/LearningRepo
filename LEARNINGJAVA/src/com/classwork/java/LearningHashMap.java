package com.classwork.java;

import java.util.HashMap;

public class LearningHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> student = new HashMap<>();
		student.put(1, "Harsh");
		student.put(2, "Yash");
		student.put(3, "Jay");
		student.put(4, "Umang");
		student.put(5, "Pradip");
		student.put(6, "Pradip");
		
		System.out.println(student);
		System.out.println(student.size());
		student.clear();
		System.out.println(student);
	}

}
