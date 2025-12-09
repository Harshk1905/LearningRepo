package com.classwork.java;

import java.util.Arrays;
import java.util.List;

public class LearningLinklist {

	public static void main(String[] args) {
		List<String> names= Arrays.asList("ABC","XYZ","Test","MNC","UHB","YGG");
		for (String getname : names) {
			if (getname.equals("Test")) {
				System.out.println("Test is Found");
				break;
			} else {
				System.out.println(getname);
			}
			
		}
	}

}
