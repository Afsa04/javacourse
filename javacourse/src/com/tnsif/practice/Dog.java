package com.tnsif.practice;

public class Dog  extends Overridinganimal{
	@Override
	public void sound() {
		System.out.println("the dog  makes sound bow");

}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
	}
}