package com.skillogic.keywordsproj.statickeyonmethod;

public class Student {
	int id;
	String name;
	static String college="CBIT";
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void displayStudent() {
		System.out.println(id+"  "+name+"   "+college);
		Colleage.displayColleageAddress();
	}
	public static void main(String[] args) {
		 Student st = new Student(111,"Suresh");
		 st.displayStudent();
	}
}
