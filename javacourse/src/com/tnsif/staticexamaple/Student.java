package com.tnsif.staticexamaple;

public class Student {
	int rolno;
	String name;
	static String collage="SRIINDU";
	static void change() {
		collage="SRIINDI";
		
	}
  Student(int r,String n){
	  rolno=r;
	  name=n;
	  
	  
  }
  void display() {
	  System.out.println(rolno+" "+name+"" +collage);
  }
}

