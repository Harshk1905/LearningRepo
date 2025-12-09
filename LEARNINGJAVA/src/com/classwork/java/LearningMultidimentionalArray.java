package com.classwork.java;

public class LearningMultidimentionalArray {

	public static void main(String[] args) {
		//                       0            1
		//                    0    1        0      1
		String [][] name = {{"Mr","Mrs"},{"abc","xyz"}};
		System.out.println(name[0][0]+name[1][0]);
		System.out.println(name[0][1]+name[1][1]);
		System.out.println(name[0][0]+name[1][1]);
		System.out.println(name[0][1]+name[1][0]);

	}

}
