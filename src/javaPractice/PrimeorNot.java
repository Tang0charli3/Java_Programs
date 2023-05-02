package javaPractice;

import java.util.Scanner;

public class PrimeorNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			System.out.println("Not a Prime Number");
			break;
		}
		else {
			System.out.println("Prime Number");
			break;
		}
	}
	
}
}
