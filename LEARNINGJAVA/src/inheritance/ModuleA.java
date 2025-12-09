package inheritance;

import java.util.Scanner;

public class ModuleA {
	
	public void input() {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter the percentage: ");
	Double Percentage = input.nextDouble();

	System.out.println("Please Enter the value");
	Double Value = input.nextDouble();
	
	Double result = (Percentage / 100) * Value;
	System.out.println(Percentage + " % " + Value + "=" + result);
	
	input.close();
	
	}

}
