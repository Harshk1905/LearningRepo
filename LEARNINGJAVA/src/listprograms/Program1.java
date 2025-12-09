package listprograms;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<String> City = Arrays.asList("India", "usa", "russia", "uk", "brazil");
		for (String getcity : City) {
			if (getcity.equals("brazil")) {
				System.out.println("brazil Found");
				break;
			}

		}
	}

}
