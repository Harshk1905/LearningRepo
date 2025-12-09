package exam;

import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {

		try {

			{

				Scanner input = new Scanner(System.in);
				System.out.println("Please Enter the percentage: ");
				Double Percentage = input.nextDouble();

				System.out.println("Please Enter the value");
				Double Value = input.nextDouble();

				Double result = (Percentage / 100) * Value;
				System.out.println(Percentage + " % " + Value + "=" + result);
				
				input.close();

			}

		} catch (Exception e) {

			System.out.println("Invalid Input");

		}
		
		
	}

}
