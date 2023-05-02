package javaPractice;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the Number");
	int num=sc.nextInt();
	int temp=num;
	int copy=num;
	int count=0;
	int sum=0;
	while(temp!=0) {
		temp=temp/10;
		count++;
	}
	for(int i=1;i<count;i++) {
		int temp2=0;
		int count2=count;
		for(int j=1;j<count;j++) {
			temp2=temp/10;
		}
	}
	System.out.println(count);
}
}
