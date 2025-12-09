package com.homework.java;

import java.util.Scanner;

public class Homework14Oct25 {
//	static int a = 100, b = 60, c = 30;
//	int x = 100, y = 60, z = 200;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value a");
		int a = input.nextInt();
		System.out.println("Please enter value b");
		int b = input.nextInt();
		System.out.println("Please enter value c");
		int c = input.nextInt();
		if (a < b && a < c) {
			System.out.println("a is smallest");
		} else if (b < a && b < c) {
			System.out.println("b is smallest");
		} else if (a == b || a == c || b == c) {
			System.out.println("Duplicate value found");
		} else {
			System.out.println("c is smaller");
		}
		Homework14Oct25 findlargestnumber = new Homework14Oct25();
		findlargestnumber.FindLargestNumber();
		input.close();
	}

	public void FindLargestNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value x");
		int x = input.nextInt();
		System.out.println("Please enter value y");
		int y = input.nextInt();
		System.out.println("Please enter value z");
		int z = input.nextInt();
		if (x > y && x > z) {
			System.out.println("x is larger");
		} else if (y > x && y > z) {
			System.out.println("y is larger");
		} else if (x == y || x == z || y == z) {
			System.out.println("Duplicate value found");
		} else {
			System.out.println("z is larger");
		}
		input.close();
	}
}
