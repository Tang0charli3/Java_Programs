package ExceptionHandelling;

import java.util.Scanner;

public class DLVerify {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the age");
	int age=sc.nextInt();
	if(age>18) {
		System.out.println("You can get DL");
	}
	else {
		throw new DrivingLicenceException("You are not eligible");
	}
}
}
