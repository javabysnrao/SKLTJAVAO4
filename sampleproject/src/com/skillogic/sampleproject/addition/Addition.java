package com.skillogic.sampleproject.addition;

public class Addition {

	public void calcuateAddition(int a,int b) {
		int c = a+b;
		System.out.println("Addition Result:: "+c);
	}
	public static void main(String args[]) {
		Addition addition  = new Addition();
		addition.calcuateAddition(10, 20);
	}
}
