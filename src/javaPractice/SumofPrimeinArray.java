package javaPractice;

import java.util.Scanner;

public class SumofPrimeinArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=sc.nextInt();
	int sum=0;
	int arr[]=new int[size];
	System.out.println("Enter the numbers");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		if(isPrime(arr[i])==true) {
			sum=sum+arr[i];
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
