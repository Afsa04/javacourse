package com.tnsif.scanner;

import java.util.Scanner;

public class Personexce {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person name");
		String name=sc.nextLine();
		System.out.println("Enter Person Income");
		int income=sc.nextInt();
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		Taxcal t=new Taxcal();
		t.calculatetax(pp);
		System.out.println("After modification");
		System.out.println(pp);
		
	
	}

}
