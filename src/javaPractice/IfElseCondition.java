package javaPractice;

import java.util.Scanner;

public class IfElseCondition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number the Number");
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println("Even");
	}
	else {
		System.out.println("Odd");
	}
	
}
}
