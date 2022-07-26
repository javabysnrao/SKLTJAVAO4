package com.skillogic.abstractproject1;

public abstract class Company {
	      private double netSalary = 0.0;
          public Company(double grossSalary) {
        	  calculateNetSalary(grossSalary);
          }
          private void calculateNetSalary(double grossSalary) {
        	    if(grossSalary>=500000) {
        	    	netSalary = grossSalary-(grossSalary*0.2);
        	    }else if(grossSalary>=300000 && grossSalary<500000) {
        	    	netSalary = grossSalary-(grossSalary*0.1);
        	    }else {
        	    	netSalary = grossSalary;
        	    }
        	    System.out.println("Net Salary of Employee :: "+netSalary);
          }
}
