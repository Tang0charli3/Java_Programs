package javaPractice;

import java.util.Scanner;

public class PrimeorNot1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("Prime Number");
	}
	else {
		System.out.println("Composite Number");
	}
}
}
