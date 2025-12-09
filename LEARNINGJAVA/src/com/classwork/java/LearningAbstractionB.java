package com.classwork.java;

public  class  LearningAbstractionB extends LearningAbstractionA {

	public static void main(String[] args) {
		LearningAbstractionB learningAbstractionB =  new LearningAbstractionB();
		learningAbstractionB.honda();
		learningAbstractionB.suzuki();

	}

	@Override
	public void honda() {
		System.out.println("This is honda method");
	}
	
	//We can not create object of abstract class

}
