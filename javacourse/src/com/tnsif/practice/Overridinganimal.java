package com.tnsif.practice;

public class Overridinganimal {
	public void sound() {
		System.out.println("the animal makes sound");
	}
public static void main(String[] args) {
	
	Dog d=new Dog();
	d.sound();
}
}
