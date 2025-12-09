package com.classwork.java;

public class LearninEncapasulation {
	
	String name;

	public static void main(String[] args) {
		LearninEncapasulation learningeEncapasulation = new LearninEncapasulation();
		learningeEncapasulation.setName("Harsh");
		System.out.println(learningeEncapasulation.getName());
	}
	
	public void setName(String firstname) {
		name = firstname;
		
	}
	
	public String getName() {
		return name;
	}

}
