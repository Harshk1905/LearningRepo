package stringoperationprograms;

public class Program1 {

	public static void main(String[] args) {
		// Program:1
		String Name = "Rajnandiniba chudasma";
		String[] Words = Name.split(" ");
		String largest = "";
		for (String i : Words) {
			if (i.length() > largest.length()) {
				largest = i;
			}
		}
		System.out.println(largest);

		// Program:2

		String Name3 = "My name is khan";
		char[] wordarray = Name3.toCharArray();
		for (int i = wordarray.length - 1; i >= 0; i--) {
			System.out.print(wordarray[i]);
		}

		//Program:3
		StringBuilder sb = new StringBuilder(Name3.length());
		for (int i = Name3.length() - 1; i >= 0; i--) {
			sb.append(Name3.charAt(i));
		}
		System.out.println(sb.toString());

		// Khan is name my

		String Name4 = "My name is khan";
		String[] word = Name4.split(" ");

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i]);
			if (i!=0) {
				System.out.print(" ");
			}
		}

	}
}
