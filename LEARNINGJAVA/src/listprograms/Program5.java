package listprograms;

import java.util.Arrays;
import java.util.List;

public class Program5 {

	public static void main(String[] args) {
		List<String> Applications = Arrays.asList("fb","insta","tik-tok","moj","mx taka-tak");
		for (String getapp : Applications) {
			if(getapp.equals("moj")) {
				System.out.println("moj is found");
				break;
			}
			else {
				System.out.println(getapp);
			}
		}
	}

}
