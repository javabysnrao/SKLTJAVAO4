package com.skillogic.keywordsproj.thiskeywords;

public class Student {
	int id;
	String name;
	String address;
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println(id+"    "+name+"    "+address);
	}
	public static void main(String[] args) {
		 Student st = new Student(1, "rajaesh", "Hyd");
		 st.display();
	} 
}
