package javaPractice;

import java.util.Scanner;

public class SecondMaxandThirdMin {
	public static void maxmin(int a[]) {
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
		max=a[2];
		min=a[a.length-2];
		System.out.println("Third Maximum Number is : "+max);
		System.out.println("Second Minimum Number is : "+min);
	}
//	public static void min(int a[]) {
//		int min=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i]<a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		min=a[1];
		
	//}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter thr number");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		maxmin(a);
		//min(a);
	}
}
