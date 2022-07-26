package com.skilloigc.inheritenceproject.is_a_relation;

public class Programmer extends Employee{
	public void displayProgrammerDetails() {
		int id =111;
		String name="Rajesh";
		double bonus = 4000;
		double totalSalary = basicSalary+bonus;
		System.out.println("Programmer Details");
		System.out.println(id+"    "+name+"    "+totalSalary);
		displayCompanyAddress();
	}
}
