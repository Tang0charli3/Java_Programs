package javaPractice;

import java.util.Scanner;

public class MethodCallStatement {
public int fact(int a) {
	int fact=1;
	for(int i=1;i<=a;i++) {
		fact=fact*i;
	}
	return fact;
}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		MethodCallStatement a1=new MethodCallStatement();
		int f=a1.fact(a);
		System.out.println(f);
}
}
