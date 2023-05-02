package javaPractice;

import java.util.Scanner;

public class FactorialReturn {
	public static int ReturnValue(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a=sc.nextInt();
	System.out.println(ReturnValue(a));
}
}
