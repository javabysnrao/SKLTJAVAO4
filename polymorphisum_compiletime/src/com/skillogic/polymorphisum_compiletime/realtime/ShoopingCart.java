package com.skillogic.polymorphisum_compiletime.realtime;

import java.util.Arrays;

public class ShoopingCart {
	public String payment(String UPI,double amount) {
		return "Payment Completd with UPI for Amount of : "+amount;
	}
	public String payment(String name,String password,double amount) {
		return "Payment Completd with Netbanking for Amount of : "+amount;
	}
	public String payment(long cardno,int cvv,String expiryDate,double amount) {
		return "Payment Completd with Credit/Debit for Amount of : "+amount;
	}
	public void addToCart(String items[], double amounts[]) {
		   double totalAmount = 0.0;
		   for (double d : amounts) {
			   totalAmount  = totalAmount+d;
		  }
		  //Call payment method
		  //String message = payment("abc@sbiok", totalAmount);
		   String message = payment("abc", "abc", totalAmount);
		  String itemss = Arrays.toString(items);
		  System.out.println("Purchaged items "+itemss+" Payment :  "+message);
	}
}
