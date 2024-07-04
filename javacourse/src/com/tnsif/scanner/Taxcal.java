package com.tnsif.scanner;

public class Taxcal {
	public void calculatetax(Person p) {
		if(p.getIncome()>1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600&&p.getIncome()<300000) {
			p.setTax(5);
		
		}
		else {
			p.setTax(10);
		}
	}



}
