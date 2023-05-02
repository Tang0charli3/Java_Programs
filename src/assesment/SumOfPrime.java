package assesment;

import java.util.Scanner;

public class SumOfPrime {
public static boolean isPrime(int a) {
	if(a==1) {
		return false;
	}
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++) {
		if(isPrime(i)==true) {
		sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
