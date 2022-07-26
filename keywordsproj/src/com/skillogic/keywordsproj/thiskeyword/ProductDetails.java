package com.skillogic.keywordsproj.thiskeyword;

public class ProductDetails {
	int id;
    String name;
    public ProductDetails() {
    	 System.out.println("0-param constructor");
    	 //logic
    }
    public ProductDetails(int pid,String pname) {
    	 this();
    	 id = pid;
    	 name = pname;
    }
    public void productPrices() {
    	System.out.println("productPrices()...........");
    }
    public void display() {
    	System.out.println(this.id+"    "+this.name);
    	this.productPrices();
    }
    public static void main(String[] args) {
		ProductDetails pd = new ProductDetails(1,"TV");
		pd.display();
	}
}
