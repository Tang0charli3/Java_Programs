package javaPractice;

import java.util.Scanner;

public class SumofArmstrongNumberOfAnArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elments");
	int sum=0;
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		int copy=a[i];
		int temp=copy;
		int count=0;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		int temp2=a[i];
		int sumfact=0;
		while(temp2!=0) {
			int count2=count;
			int rem=temp2%10;
			int fact=1;
			while(count2!=0) {
				fact=fact*rem;
				count--;
			}
			sumfact=sumfact+fact;
			temp2=temp2/10;
		}
		if(copy==sumfact) {
			sum=sum+sumfact;
		}
	}
	System.out.println(sum);
}
}
