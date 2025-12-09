package com.classwork.java;

public class LearningExaptionHandeling {

	public static void main(String[] args) {
		try {
			int a = 5/1;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Devide by zero is not possible");
		} catch (Exception e) {
			System.out.println("Hendle all type of exception");
		}
		finally {
			System.out.println("File close code should be written here");
		}
	
		//Final : final is a keyword, 
		//Finally: Finally is a block
		
	}

}
