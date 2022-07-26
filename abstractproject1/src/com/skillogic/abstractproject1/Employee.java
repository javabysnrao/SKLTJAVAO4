package com.skillogic.abstractproject1;

public class Employee extends Company{
	public Employee(double grossSalary) {
		super(grossSalary);//It is going to call Company class constructor
		System.out.println("Employee 1-param constrcut");
		System.out.println("Employe Gross Salary : "+grossSalary);
	}
	public static void main(String[] args) {
		System.out.println("Main method.....");
	     Employee e = new Employee(200000);	
	}
}
