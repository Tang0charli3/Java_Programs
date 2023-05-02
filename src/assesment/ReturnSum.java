package assesment;

import java.util.Scanner;

public class ReturnSum {
public static int sum(int a[]) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	int sumof=sum(a);
	System.out.println(sumof);
}
}
