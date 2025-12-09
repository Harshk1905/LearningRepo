package listprograms;

import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<Integer> Numbers = Arrays.asList(11, 22, 33, 44, 55);
		for (Integer getnumber : Numbers) {
			if (getnumber.equals(11)) {
				System.out.println("11 Found");
				break;
			} else {
				System.out.println(getnumber);
			}

		}

	}

}
