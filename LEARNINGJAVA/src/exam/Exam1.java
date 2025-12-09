package exam;

import java.util.Arrays;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		getCity();

	}

	public static void getCity() {
		List<String> Teams = Arrays.asList("MI", "CSK", "RCB", "DC", "RR");
		for (String getteame : Teams) {
			if (getteame.equals("DC")) {
				System.out.println("DC Found!");
				break;
			} else {
				System.out.println(getteame);
			}
		}

	}
}