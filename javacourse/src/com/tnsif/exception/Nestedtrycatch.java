package com.tnsif.exception;

public class Nestedtrycatch {
	public static void check(){
		String str="TNS";
		int slength=str.length();
		System.out.println("String length"+slength);
		String anotherstring ="Afsa";
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of bound exception"+e.getMessage());
			}
		System.out.println("String length"+anotherstring.length());	
		}
		catch(NullPointerException ex) {
			System.out.println("exception is thrown"+ ex.getMessage());
		}
	}

}
