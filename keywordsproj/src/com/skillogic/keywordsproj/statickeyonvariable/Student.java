package com.skillogic.keywordsproj.statickeyonvariable;

public class Student {
	int id;
	String name;
	static String colleage="CBIT";
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void display() {
		System.out.println(id+"    "+name+"    "+colleage);
	}
	public static void main(String[] args) {
		 Student s1 = new Student(1, "Rajesh");
		 Student s2 = new Student(2,"Hareesh");
		 s1.display();
		 s2.display();
	}
}
