package javaPractice;

import java.util.Scanner;

public class SumOfPrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int range=sc.nextInt();
	int sum=0;
	for(int i=1;i<=range;i++) {
		if(isPrime(i)==true) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
public static boolean isPrime(int a) {
	if(a==1) {
		return false;
	}
	for(int i=2;i<=a/2;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
}
