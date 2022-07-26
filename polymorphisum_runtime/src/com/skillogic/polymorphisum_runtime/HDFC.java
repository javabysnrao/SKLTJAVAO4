package com.skillogic.polymorphisum_runtime;

public class HDFC extends RBI{
	 public HDFC() {
		 super(); //it is going to call super class constructor
		 System.out.println("HDFC 0-pram constructor");
	 }
	  public double getRateOfInterest() {
		  String gl[]=super.guideLines; //variables belongs to super class
		  System.out.println(gl[0]);
		  String address=super.address(); //accessing super class method
		  System.out.println("RBI Addess : "+address);
		  //other logics
		  double interest = 11.5;
		   return interest;
	   }
}
