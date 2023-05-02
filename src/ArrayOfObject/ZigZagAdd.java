package ArrayOfObject;

import java.util.Scanner;

public class ZigZagAdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int a[]=new int[size];
	int b[]=new int[size];
	int sum[]=new int[a.length+b.length];
	int d=0;
	int e=0;
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		b[i]=sc.nextInt();
	}
	
	for(int i=0;i<sum.length;i++) {
		if(i%2==0) {
			sum[i]=a[d];
			d++;
		}
		else {
			sum[i]=b[e];
			e++;
		}
	}
	for(int all : sum) {
		System.out.println(all);
	}
}
}
