package com.homework.java;

import java.util.Scanner;

public class Homework15Oct25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of values for array:-");
		int a = input.nextInt();

		int[] number = new int[a];
		System.out.println("Please enter the values of array:-");
		for (int i = 0; i < a; i++) {
			number[i] = input.nextInt();
		}
		System.out.println("Your entered values are:");
		for (int i = 0; i < a; i++) {
			System.out.println(number[i] + " ");
		}
		System.out.println();
		int largest = number[0];
		for (int i = 1; i < a; i++) {
			if (number[i] > largest) {
				largest = number[i];

			}

			input.close();
		} System.out.println(largest);
	}

}
