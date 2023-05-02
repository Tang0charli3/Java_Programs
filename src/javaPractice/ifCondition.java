package javaPractice;

import java.util.Scanner;

public class ifCondition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a=3;
	int num=sc.nextInt();
	if(num%a==0) {
		System.out.println("Hello");
	}
}
}
