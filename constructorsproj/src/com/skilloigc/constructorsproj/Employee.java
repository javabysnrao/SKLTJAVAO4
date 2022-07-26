package com.skilloigc.constructorsproj;

public class Employee {
	public Employee() {
	  System.out.println("0-param constructor");
	}
	public Employee(int id) {
		System.out.println("1-param constructor   "+id);
	}
	public Employee(String name) {
		System.out.println("1-param constructor  "+name);
	}
	public Employee(String name,double salary) {
		System.out.println("2-param constructor  "+name+"   "+salary);
	}
	public Employee(double salary,String name) {
		System.out.println("2-param constructor  "+salary+"    "+name);
	}
	public static void main(String[] args) {
	     Employee e1=new Employee();
	     Employee e2=new Employee("Hyderabad");
	     Employee e3=new Employee("Rajaesh",40000);
	     Employee e4=new Employee(40000,"Rajaesh");
	     Employee e5=new Employee(111);
	}
}
