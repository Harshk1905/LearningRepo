package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		List<String> Teams = new ArrayList<>(Arrays.asList("MI", "CSK", "RCB", "DC", "RR"));
		Teams.remove(3);
		System.out.println(Teams);
		System.out.println(Teams.get(2));
	}

}
