package exam;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the Numbers ");
		int Numbers = input.nextInt();

		int f = 0, s = 1;

		System.out.print("Fibonacci series:");
		for (int i = 1; i <= Numbers; i++) {
			System.out.print(f + " ");
			int febo = f + s;
			f=s;
			s = febo;
		}
		
		input.close();

	}

}
