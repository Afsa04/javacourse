package com.tnsif.packages;

public class Publicdemo {
	public int a=10; //if i make private it will not access in other class or package
	public static void main (String [] args) {
		Publicdemo p = new Publicdemo();
		System.out.println(p.a);
	}


}
