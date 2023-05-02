package javaPractice;

import java.util.Scanner;

public class ScannerMethod {
	public static int sum(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int b=sum(a);
		System.out.println(b);
	}
}
}
