package javaPractice;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the Number");
	int num=sc.nextInt();
	//int num=54748;
	int copy=num;
	int temp=copy; int count=0;
	while(temp!=0) {
		count++;
		temp=temp/10;
	}
	//System.out.println(count);
	int temp2=num; 
	int sumfact=0;
	while(temp2!=0) {
		int count2=count;
		int rem=temp2%10;
		int fact=1;
		while(count2!=0) {
		fact=fact*rem;
		count2--;
		}
		sumfact=sumfact+fact;
		temp2=temp2/10;
	}
	if(copy==sumfact) {
		System.out.println("ArmStrong");
	}
	else {
		System.out.println("false");
	}
}
}
