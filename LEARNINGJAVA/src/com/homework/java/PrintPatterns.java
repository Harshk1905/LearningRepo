package com.homework.java;

public class PrintPatterns {

	public static void main(String[] args) {
		int up = 5;

		for (int i = 1; i <= up; i++) {
			if (i == 1) {
				System.out.println("*");
			} else if (i == 2) {
				System.out.println("**");
			} else {
				System.out.print("**");
			}
			for (int a = 3; a <= i; a++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		PrintPatterns pattern = new PrintPatterns();
		pattern.Pattern2();

	}

	public void Pattern2() {
		int down = 5;
		System.out.println("--------------PATTERN2--------------");
		for (int i = 0; i < down; i++) {
			for (int a = 0; a < i * 2; a++) {
				System.out.print(" ");
			}
			for (int b = 0; b < down - i; b++) {
				System.out.print("*");
				if (b < down - i - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
