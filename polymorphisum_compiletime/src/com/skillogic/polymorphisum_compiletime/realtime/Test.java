package com.skillogic.polymorphisum_compiletime.realtime;

public class Test {
	public static void main(String[] args) {
		ShoopingCart shp = new ShoopingCart();
		String items[] =  {"TV","Mobile","Laptop"};
		double prices[] = {50000,10000,30000};
		shp.addToCart(items,prices );
	}
}
