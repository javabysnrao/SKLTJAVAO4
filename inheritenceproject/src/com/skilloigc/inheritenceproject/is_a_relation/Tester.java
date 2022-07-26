package com.skilloigc.inheritenceproject.is_a_relation;

public class Tester extends Employee{
	public void displayTesterDetails() {
		int id =222;
		String name="Suresh";
		double bonus = 3000;
		double totalSalary = basicSalary+bonus;
		System.out.println("Tester Details");
		System.out.println(id+"    "+name+"    "+totalSalary);
		displayCompanyAddress();
	}
}
