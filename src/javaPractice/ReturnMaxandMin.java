package javaPractice;

import java.util.Scanner;

public class ReturnMaxandMin {
	public static void max(int a[]) {
		int max=0;
		int min=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		max=a[0];
		min=a[a.length-1];
		System.out.println(max+min);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter thr number");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		max(a);
	}
}
