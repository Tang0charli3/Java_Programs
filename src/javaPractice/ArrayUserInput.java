package javaPractice;

import java.util.Scanner;

public class ArrayUserInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size");
	int a=sc.nextInt();
	int ele[]=new int[a];
	System.out.println("Enter the numbers");
	for(int i=0;i<ele.length;i++) {
		ele[i]=sc.nextInt();
	}
	for(int i=0;i<ele.length;i++) {
		System.out.print(ele[i]+" ");
	}
}
}
