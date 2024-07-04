package com.tnsif.scanner;

import java.util.Scanner;

public class Scannerexample {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("enter your name");
		
			String name=sc.nextLine();
		 
			System.out.println("enter your roll");
			int roll= sc.nextInt();
			sc.close();
			System.out.println("name: " + name);
			 System.out.println("rollr: " +roll);

		}		


}
