package com.skilloigc.inheritenceproject.has_a_relation;

public class Programmer extends Employee{
	Address address;
	public void displayProgrammerDetails() {
		int id =111;
		String name="Rajesh";
		double bonus = 4000;
		double totalSalary = basicSalary+bonus;
		System.out.println("Programmer Details");
		System.out.println(id+"    "+name+"    "+totalSalary);
		displayCompanyAddress();
		System.out.println("-------------------------------------");
		address = new Address("1234/46","Kukatpally","Hyd",500085);
		address.displayAddress();
	}
}
