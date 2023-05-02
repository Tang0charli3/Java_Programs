package javaPractice;

import java.util.Scanner;

public class PalendromeNumber {
	public static int palin(int a) {
		int rev=0;
		while(a>0) {
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int temp=num;
	int rev=palin(temp);
	if(num==rev) {
		System.out.println("It's a Palindrome");
	}
	else {
		System.out.println("Not a Palindrome");
	}
}
}
