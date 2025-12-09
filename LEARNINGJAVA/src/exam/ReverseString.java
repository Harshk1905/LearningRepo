package exam;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "This is test";
		char[] wordarray = s1.toCharArray();
		for (int i= wordarray.length-1;i>=0;i--) {
			System.out.print(wordarray[i]);
		}
	}

}
