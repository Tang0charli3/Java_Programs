package javaPractice;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int size=sc.nextInt();
	int arr[]=new int[size];
	//int num=sc.nextInt();
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size-1;i++) {
		for(int j=i+1;j<size;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int a:arr) {
		System.out.println(a);
	}
}
}
