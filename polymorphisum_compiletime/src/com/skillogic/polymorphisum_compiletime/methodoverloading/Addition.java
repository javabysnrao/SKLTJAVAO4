package com.skillogic.polymorphisum_compiletime.methodoverloading;

public class Addition {
	public void sum(int a,int b) {
		System.out.println("Addition of two numbers : "+(a+b));
	}
	public void sum(int a,int b,int c) {
		System.out.println("Addition of three numbers : "+(a+b+c));
	}
	public void sum(double a,double b) {
		System.out.println("Addition of two numbers(Double) : "+(a+b));
	}
	public static void main(String[] args) {
		System.out.println("Main method.......");
		Addition addition = new Addition();
		addition.sum(10, 20);
		addition.sum(10, 20, 30);
		addition.sum(10.5, 20.5);
	}
}
