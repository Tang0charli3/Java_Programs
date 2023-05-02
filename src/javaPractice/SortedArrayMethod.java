package javaPractice;

import java.util.Scanner;

public class SortedArrayMethod {
	public static int[] sortedarray(int a[]){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int b[]=sortedarray(arr);
		for (int i=0;i<size;i++) {
			System.out.println(b[i]);
		}
	}
}
