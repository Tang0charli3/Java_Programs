package javaPractice;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int range=sc.nextInt();
	for(int i=1;i<range;i++) {
		int no=i;
		int count=0;
		for(int j=1;j<range;j++) {
			if(no%j==0) {
				count++;
			}
			}
		if(count==2) {
			sum=sum+no;
		}
	}
	System.out.println(sum);
}
}
