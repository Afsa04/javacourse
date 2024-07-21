package com.tnsif.practice;

public class Nest implements  nestedInterface.myinnernested {


	@Override
	public void display() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		Nest n= new Nest();
		n.display();
		System.out.println(Nest.id);
	}
}
