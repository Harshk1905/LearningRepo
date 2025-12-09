package listprograms;

import java.util.Arrays;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		List<String> Games = Arrays.asList("bat","ball","football","hockey","baseball");
		for (String getgames : Games) {
			if (getgames.equals("hockey")) {
				System.out.println("hockey is found");
				break;
			}
			else {
				System.out.println(getgames);
			}
			
		}
	}

}
