package com.skilloigc.inheritenceproject.has_a_relation;

public class Tester extends Employee{
	Address address;
	public void displayTesterDetails() {
		int id =222;
		String name="Suresh";
		double bonus = 3000;
		double totalSalary = basicSalary+bonus;
		System.out.println("Tester Details");
		System.out.println(id+"    "+name+"    "+totalSalary);
		displayCompanyAddress();
		address = new Address("45/58","Ameerpet","Hyd",500075);
		address.displayAddress();
	}
}
