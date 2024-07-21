package throwex;

import java.util.Scanner;

public class Testdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollno");
		int rollno=sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("ROLL NUMBER CANNOT B NEGative");
		}
		else {
			System.out.println("valid roll no");
		}
}

}
