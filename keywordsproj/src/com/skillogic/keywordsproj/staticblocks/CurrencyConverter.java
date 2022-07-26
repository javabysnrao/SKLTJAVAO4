package com.skillogic.keywordsproj.staticblocks;

public class CurrencyConverter {
	static {
		System.out.println("static block is called......");
		double dollarPirce = 80.00;
		System.out.println("Today dollar Price: "+dollarPirce);
	}
	public  void getIndianRuppes(int dollar) {
		System.out.println("getIndianRuppes.......");
	}
	public static void main(String[] args) {
		 System.out.println("Main method.....");
		 CurrencyConverter cc = new CurrencyConverter();
		 cc.getIndianRuppes(1);
	}
}
