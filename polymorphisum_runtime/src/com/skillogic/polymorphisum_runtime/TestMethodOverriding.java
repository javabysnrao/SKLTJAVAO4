package com.skillogic.polymorphisum_runtime;

public class TestMethodOverriding {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		double result1=sbi.getRateOfInterest();
		System.out.println("SBI interest in % :"+result1);
		System.out.println("===========================");
		HDFC hdfc = new HDFC();
		double result2=hdfc.getRateOfInterest();
		System.out.println("HDFC interest in % :  "+result2);
	}
}
