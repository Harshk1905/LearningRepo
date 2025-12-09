package com.classwork.java;

public class LearningInterfaceC implements LearningInterfaceA,LearningInterfaceB {

	public static void main(String[] args) {
		LearningInterfaceC learningInterfaceC = new LearningInterfaceC();
		learningInterfaceC.cat();
		learningInterfaceC.dog();
	}

	@Override
	public void cat() {
		System.out.println("This is Cat");
	}

	@Override
	public void dog() {
		System.out.println("This is dog");
	}

}
