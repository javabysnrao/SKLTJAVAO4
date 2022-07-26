package com.skilloigc.inheritenceproject.is_a_relation;

public class TestInheritence {
	  public static void main(String[] args) {
		 Programmer p1 = new Programmer();//Object creation
		 p1.displayProgrammerDetails();//calling method
		 System.out.println("-------------------------------------------");
		 Tester t1 = new Tester();
		 t1.displayTesterDetails();
	}
}
