package com.classwork.java;

import java.util.Scanner;

public class LearningUserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Your Name:");
		String name = input.next();
		System.out.println("Name Entered by User is="+name);
		
		System.out.println("Please Enter Your Age:");
		int age = input.nextInt();
		System.out.println("Age entered by user is="+age);
		
		
		input.close();
		
		

	}

}
