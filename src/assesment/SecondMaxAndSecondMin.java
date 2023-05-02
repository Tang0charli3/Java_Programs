package assesment;

import java.util.Scanner;

public class SecondMaxAndSecondMin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(a[i]<a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	int sum=0;
	sum=a[1]+a[size-2];
	System.out.println(sum);
}
}
