package listprograms;

import java.util.Arrays;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		List<Double> Decimals = Arrays.asList(40.32, 12.24, 18.32, 99.36, 12.24);
		for (Double getvalues : Decimals) {
			if (getvalues.equals(12.24)) {
				System.out.println("12.24 is Found");
				break;
			} else {
				System.out.println(getvalues);
			}
		}

	}

}
