package com.classwork.java;

public class LearningString {

	public static void main(String[] args) {
		String s1 = "This is a FIRST string";
		String s2 = "THIS is a second STRING";
		
		
		//Uper and Lower Case
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//Start and endwith - Output always in boolean
		boolean start=s1.startsWith("This");
		System.out.println(start);
		
		boolean end = s2.endsWith("@");
		System.out.println(end);
		
		//Index of end character at
		int index = s1.indexOf("i");
		System.out.println(index);
		
		char word = s2.charAt(2);
		System.out.println(word);
		
		//Replace
		String s3 = s1.replace("i", "@");
		System.out.println(s3);
		
		//Sub string
		
		String s4 = s2.substring(0,10);
		System.out.println(s4);
		
		//Covert string to character array
		char[] wordarray=s1.toCharArray();
		for (int i=0;i< wordarray.length; i++) {
			System.out.println(wordarray[i]);
		}
		
		//Print the length
		System.out.println(s1.length());
		
		//Equals Comparision
		String s5 = "FIRST";
		if (s1.equals(s5)) {
			System.out.println("match");
		} else {
			System.out.println("Not Matched");
		}
		
		//Partial Comparision
		if(s1.contains(s5)) {
			System.out.println("Partialy Matched");
		} else {
			System.out.println("Partialy not matched");
		}
		
		
	}

}
