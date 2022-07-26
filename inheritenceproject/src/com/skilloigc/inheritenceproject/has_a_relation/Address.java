package com.skilloigc.inheritenceproject.has_a_relation;

public class Address {
      String doorNo;
      String areaName;
      String city;
      int pincode;
	public Address(String doorNo, String areaName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.city = city;
		this.pincode = pincode;
	}
	public void displayAddress() {
		System.out.println(doorNo+"     "+areaName+"     "+city+"      "+pincode);
	}
}
